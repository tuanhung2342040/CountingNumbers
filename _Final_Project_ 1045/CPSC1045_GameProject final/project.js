let ctx = document.getElementById('myCanvas').getContext('2d');
let startGameBnt = document.getElementById('startGame');
let addBalls = document.getElementById('addBalls');
let displayScore = document.getElementById('score');
let displayLives = document.getElementById('lives');
startGameBnt.addEventListener('click', moveDots);
addBalls.addEventListener('click', addDotLevel);
myCanvas.addEventListener('click', moveProjectile);
// all variables of dots
let dotArray = [];
let dot;
let x;
let y;
let mx;
let my;
let radius;
let color;
// all variables of projectiles
let projectileArray = [];
let projectiles;
let px;
let py;
let pmx;
let pmy;
let pRadius;
let pColor;

let timerId;
let score = 0; 
let lives = 5;
let level;
let option;
let angle;
let currentX;
let currentY;
let dx;
let dy;
let distance;
let animate;

let particleArray = [];
let particleX;
let particleY;
let particleRadius;
let particles;
let particleMX;
let particleMY;
let particleColor;


let numberOfBalls = 0;
/**
 * get the input from the player
 */
function getUserInput(){
    level = Number(prompt('To start the game, please choose a level: 1, 2, 3, or 4'));
    while(true){
        /* if the input is not a number, or input is not between 1 and 4,
        ask the user to input again*/
        if(isNaN(level) || level < 1 || level > 4){
            alert('Please enter a number between 1 and 4');
            level = Number(prompt('To start the game, please choose a level: 1, 2, 3, or 4'));
        }
        // if the input is between 1 and 4, assign the number of balls, break the loop
        else{
            if(level === 1){
                numberOfBalls = 5;
                break;
            }
            else if(level === 2){
                numberOfBalls = 10;
                break;
            }
            else if(level === 3){
                numberOfBalls = 15;
                break;
            }
            else{
                numberOfBalls = 20;
                break;
            }
        }
    }
}
/**
 * Create a constructor for player to play
 * @param {number} x The x coordinate of the player
 * @param {number} y The y coordinate of the player
 * @param {draw} drawPlayer draw the player
 */
function Player(x, y){
    this.x = x;
    this.y = y;
    this.drawPlayer = function (){
        ctx.save();
        ctx.beginPath();
        ctx.drawImage(spaceship, 625, 475, 210, 313, 
            player.x-25, player.y-65, 50, 50);
        ctx.restore();
    }
}
//An image with the dimensions 1440×960
let spaceship = new Image();
spaceship.src = "ship1.jpg";
// set up properties of a player
// The player is positioned at the bottom middle of the screen

let playerX = myCanvas.width/2;
let playerY = myCanvas.height-50;
let player = new Player(playerX, playerY);
player.drawPlayer();
// get the input from the player(choose level)
getUserInput();


/**
 * create a constructor for Dots
 * @param {number} x The x coordinate of the dot
 * @param {number} y The y coordinate of the dot
 * @param {number} radius The radius of the dot
 * @param {String} color The color of the dot
 * @param {number} mx The speed of the x coordinate of the dot
 * @param {number} my The speed of the y coordinate of the dot
 */
function Dot(x, y, radius, color, mx, my){
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.color = color;
    this.mx = mx;
    this.my = my;
    this.draw = function(){
        ctx.save();
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.radius, 0, 2*Math.PI);
        ctx.fillStyle = this.color;
        ctx.fill();
        ctx.restore();
    }
    this.update = function(){
        this.x += this.mx;
        this.y += this.my;
    }
}
/**
 * add dots to the game with random speeds and colors.
 */
function addDotLevel(){
    for(let i = 0; i < numberOfBalls; i++){
        x = Math.floor(Math.random()*601);
        y = 0;
        console.log(x, y);
        radius = Math.floor(Math.random()*21 + 10);
        color = 'rgb(' + Math.floor(Math.random()
        * 256) + ',' + Math.floor(Math.random() * 256) + ',' +
         Math.floor(Math.random() * 256) + ')';
        mx = Math.floor(Math.random()*2+3);
        my = Math.floor(Math.random()*2+3);
        dot = new Dot(x, y, radius, color, mx, my);
        dot.draw(); 
        dotArray.push(dot);
    }
}
/**
 * animate the dots moving from the top to the bottom of the screen
 */
function moveDots(){
    if(timerId == null){
        timerId = setInterval(() =>{
            ctx.clearRect(0, 0, 600, 400);
            player.drawPlayer();
            for(let i = 0; i < dotArray.length;i++){
                dotArray[i].draw();
                dotArray[i].y += dotArray[i].my;
            }
        }, 100);
    }
}
/**
 * check if the dot array is empty or not
 */
function emptyDotArray(){
    if(dotArray.length === 0){
        clearInterval(timerId);
        timerId = null;
        addDotLevel();
        dotArray.mx += 20;
        dotArray.my += 20;
        moveDots();
    }
}
/**
 * check if projectiles and dots collide or not.
 * if they collide, remove the dot and add points to the score.

 */
function collisions(){
    // Compare projectiles with individual dots
    for(let i = projectileArray.length-1; i >=0; i--){
        let tempRPr = projectileArray[i].radius;
        let tempXPr = projectileArray[i].x;
        let tempYPr = projectileArray[i].y;
        // if the projectile is out of the canvas, remove it from the array.
        if(tempXPr + tempRPr < 0 || tempXPr -  tempRPr > 600 ||
            tempYPr.y -  tempRPr > 400 || tempYPr + tempRPr < 0){
                projectileArray.splice(i, 1);
            }
        for(let j = dotArray.length-1; j >= 0 ; j--){
            dx = (dotArray[j].x + dotArray[j].radius) - (tempXPr + tempRPr);
            dy = (dotArray[j].y + dotArray[j].radius) - (tempYPr + tempRPr);
            distance = Math.sqrt(dx * dx + dy * dy);
            //if the dot is out of the canvas, remove it from the array.
            if((dotArray[j].y - dotArray[j].radius) > 400){
                lives -= 1;
                displayLives.innerHTML = lives;
                dotArray.splice(j, 1);
            } 
            /* If the distance between the projectiles and the dots 
            are less than the sum of the radius between them
            then the score will be added 100 points
            */
            if (distance < tempRPr + dotArray[j].radius){
                /*If the radius of the dots is greater than 20,
                their radius will be divided by 2*/
                if(dotArray[j].radius > 20){
                    dotArray[j].radius = Math.floor(dotArray[j].radius/2);
                    projectileArray.splice(i, 1);
                    console.log(dotArray);
                    console.log(projectileArray);
                }
                // Otherwise, nothing happens
                else{
                    score += 100;
                    displayScore.innerHTML = score;
                    dotArray.splice(j, 1);
                    projectileArray.splice(i, 1);
                    console.log(dotArray);
                    console.log(projectileArray);
                }
                moveParticles();

                
            }
        }
              
    }
}
/**
 * if the player has no lives left, restart the game
 */
function restart(){
    if(lives === 0){
        alert('You lost all your lives. Game over!');
        alert('Thanks for playing!');
        alert('Your score is ' + score);
        score = 0;
        lives = 5;
        displayLives.innerHTML = 5;
        displayScore.innerHTML = 0;
        player = new Player(playerX, playerY);
        dotArray = []; 
        projectileArray =[];
        particleArray =[];
        getUserInput();
    }
}
/**
 * create projectiles and using animations to move them
 * @param {Event} e 
 */
function moveProjectile(e){
    animate = requestAnimationFrame(moveProjectile);
    // add properties of each projectile in the projectile array.
    currentX = e.offsetX;
    currentY = e.offsetY;
    px = myCanvas.width/2;
    py = myCanvas.height-90;
    angle = Math.atan2(currentY - myCanvas.height + 90, 
        currentX - myCanvas.width/2);
    pmx = Math.cos(angle);
    pmy = Math.sin(angle);
    pRadius = 5;
    pColor = "#00BFFF";
    projectiles = new Dot(px, py, pRadius, pColor, pmx, pmy);
    projectiles.draw();
    projectileArray.push(projectiles);

    ctx.clearRect(0, 0, myCanvas.width, myCanvas.height);
    /* redraw the player so that when the projectile is fired, 
    the player will not be affected*/
    player.drawPlayer();
    /* redraw the dots so that when the projectile is fired, 
    the dots will not be affected*/
    for(let i = 0; i < dotArray.length;i++){
        dotArray[i].draw();
    }
    //draw the projectiles and update their positions.
    for(let i = 0; i < projectileArray.length;i++){
        projectileArray[i].draw();
        projectileArray[i].update();
    }
    // draw the particles
    for(let i = 0; i < particleArray.length;i++){
        particleArray[i].draw();
    }
    
    // check if the projectiles collide with the dots
    collisions();
    // check if the dots array is empty
    emptyDotArray();
    // check if the player has no lives left
    restart();
}
// add particles when the player collides with the dots
function addParticles(){
    for(let i = 0; i < 10; i++){
        particleX = 300;
        particleY = 200;
        particleRadius = 4;
        particleMX = 10*(Math.random() - 0.5);
        particleMY = 10*(Math.random() - 0.5);
        particleColor = 'rgb(' + Math.floor(Math.random()
        * 256) + ',' + Math.floor(Math.random() * 256) + ',' +
        Math.floor(Math.random() * 256) + ')';
        particles = new Dot(particleX, particleY, particleRadius, particleColor, particleMX, particleMY);
        particles.draw(); 
        particleArray.push(particles);
    }
}
// move the particles
function moveParticles(){
    addParticles();
    if(timerId == null){
        setInterval(() => {
            clearRect(0, 0, 600, 400);
            for(let i = 0; i < particleArray.length; i++){
                particleArray[i].draw();
                particleArray[i].update();
            }
        }, 100)
    }
}










