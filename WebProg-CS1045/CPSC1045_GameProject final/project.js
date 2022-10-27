let ctx = document.getElementById('myCanvas').getContext('2d');
let button1 = document.getElementById('button1');
let lv1 = document.getElementById('lv1');
let lv2 = document.getElementById('lv2');
let lv3 = document.getElementById('lv3');
let lv4 = document.getElementById('lv4');
let img = document.getElementById('img');
let display_score = document.getElementById('score');
let display_lives = document.getElementById('lives');

button1.addEventListener('click', moveDots);
lv1.addEventListener('click', addDotLevel1);
lv2.addEventListener('click', addDotLevel2);
lv3.addEventListener('click', addDotLevel3);
lv4.addEventListener('click', addDotLevel4);
myCanvas.addEventListener('click', moveProjectile);

let timerId;
let Dots = [];
let dot;
let x;
let y;
let mx;
let my;
let radius;
let color;
let score = 0; 
let lives = 5;

let projectileArray = [];
let projectiles;
let px;
let py;
let pmx;
let pmy;
let pRadius;
let pColor;

let player;
let playerX;
let playerY;
let playerRadius;
let playerColor;

let angle;
let currentX;
let currentY;
//An image with the dimensions 1440 × 960
let spaceship = new Image();
spaceship.src = "ship1.jpg";
createPlayer();
/*create a constructor for player to play, including 4 properties
-  x, y are the coordinates of the player
-  radius: the radius of the player
-  color: the color of the player 
*/
function Player(x, y, radius, color){
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.color = color;
    this.drawPlayer = function (){
        ctx.save();
        ctx.beginPath();
        ctx.drawImage(spaceship, 625, 475, 210, 313, player.x-25, player.y-65, 50, 50);
    }
}
// set up properties of a player
// The player is positioned at the bottom middle of the screen
function createPlayer(){
    playerRadius = 30;
    playerX = myCanvas.width/2;
    playerY = myCanvas.height-50;
    playerColor = 'lightblue';
    player = new Player(playerX, playerY, playerRadius, playerColor);
    player.drawPlayer();
}
// upload an image for the player, which is a spaceship
/*function spaceship(){
    let img = new Image();
    img.src = "ship1.jpg";
    img.onload = function(){
        
        ctx.drawImage(img, 625, 475, 210, 313, player.x-25, player.y-65, 50, 50);
    }
}*/
// create projectiles and using animations to move them
function moveProjectile(e){
    requestAnimationFrame(moveProjectile);
    // add projectiles
    currentX = e.offsetX;
    currentY = e.offsetY;
    px = myCanvas.width/2;
    py = myCanvas.height-90;
    angle = Math.atan2(currentY - myCanvas.height + 90, currentX - myCanvas.width/2);
    pmx = Math.cos(angle);
    pmy = Math.sin(angle);
    pRadius = 5;
    pColor = "#00BFFF";
    projectiles = new Dot(px, py, pRadius, pColor, pmx, pmy);
    projectiles.draw();
    projectileArray.push(projectiles);

    ctx.clearRect(0, 0, myCanvas.width, myCanvas.height);
    // redraw the player
    player.drawPlayer();
    //redraw the dots
    for(let i = 0; i < Dots.length;i++){
        Dots[i].draw();
    }
    for(let i = 0; i < projectileArray.length;i++){
        projectileArray[i].draw();
        projectileArray[i].update();
    }
    collisions();
}
/*create a constructor for Dots, which includes
x, y: the coordinate of Dots
radius: the radius of Dots
Color: the color of Dots
mx, my: the speed of the Dots
*/
function Dot(x, y, radius, color, mx, my){
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.color = color;
    this.mx = mx;
    this.my = my;
    this.draw = () =>{
        ctx.save();
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.radius, 0, 2*Math.PI);
        ctx.fillStyle = this.color;
        ctx.fill();
        ctx.restore();
    }
    this.update = () =>{
        this.x += this.mx;
        this.y += this.my;
    }
}
// add 5 dots to the game
function addDotLevel1(){
    for(let i = 0; i < 5; i++){
        x = Math.floor(Math.random()*601);
        y = 0;
        console.log(x, y);
        radius = Math.floor(Math.random()*21 + 10);
        color = 'rgb(' + Math.floor(Math.random()
        * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256)
        + ')';
        mx = Math.floor(Math.random()*2+1);
        my = Math.floor(Math.random()*2+1);
        dot = new Dot(x, y, radius, color, mx, my);
        dot.draw(); 
        Dots.push(dot);
    }
}
// add 10 dots to the game
function addDotLevel2(){
    for(let i = 0; i < 10; i++){
        x = Math.floor(Math.random()*601);
        y = 0;
        console.log(x, y);
        radius = Math.floor(Math.random()*21 + 10);
        color = 'rgb(' + Math.floor(Math.random()
        * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256)
        + ')';
        mx = Math.floor(Math.random()*2+2);
        my = Math.floor(Math.random()*2+2);
        dot = new Dot(x, y, radius, color, mx, my);
        dot.draw(); 
        Dots.push(dot);
    }
}
// add 15 dots to the game
function addDotLevel3(){
    for(let i = 0; i < 15; i++){
        x = Math.floor(Math.random()*601);
        y = -radius;
        console.log(x, y);
        radius = Math.floor(Math.random()*21 + 10);
        color = 'rgb(' + Math.floor(Math.random()
        * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256)
        + ')';
        mx = Math.floor(Math.random()*2+3);
        my = Math.floor(Math.random()*2+3);
        dot = new Dot(x, y, radius, color, mx, my);
        dot.draw(); 
        Dots.push(dot);
    }
}
// add 20 dots to the game
function addDotLevel4(){
    for(let i = 0; i < 20; i++){
        x = Math.floor(Math.random()*601);
        y = -radius;
        console.log(x, y);
        radius = Math.floor(Math.random()*21 + 10);
        color = 'rgb(' + Math.floor(Math.random()
        * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256)
        + ')';
        mx = Math.floor(Math.random()*2+4);
        my = Math.floor(Math.random()*2+4);
        dot = new Dot(x, y, radius, color, mx, my);
        dot.draw(); 
        Dots.push(dot);
    }
}
function moveDots(){
    if(timerId == null){
        timerId = setInterval(() =>{
            ctx.clearRect(0, 0, 600, 400);
            player.drawPlayer();
            for(let i = 0; i < Dots.length;i++){
                Dots[i].draw();
                Dots[i].y += Dots[i].my;
            }
        }, 100);
    }
}
// check if projectiles and dots collide or not
function collisions(){
    let dx;
    let dy;
    let distance;
    // Compare projectiles with individual dots
    for(let i = projectileArray.length-1; i >=0; i--){
        if(projectileArray[i].x + projectileArray[i].radius < 0 || projectileArray[i].x -  projectileArray[i].radius > 600 ||
            projectileArray[i].y -  projectileArray[i].radius > 400 || projectileArray[i].y + projectileArray[i].radius < 0){
                console.log('Out of the border.')
                projectileArray.splice(i, 1);
            }
        for(let j = Dots.length-1; j >= 0 ; j--){
            dx = (Dots[j].x + Dots[j].radius) - (projectileArray[i].x + projectileArray[i].radius);
            dy = (Dots[j].y + Dots[j].radius) - (projectileArray[i].y + projectileArray[i].radius);
            distance = Math.sqrt(dx * dx + dy * dy);
            /* If the distance between the projectiles 
            and the dots are less than the sum of the radius betwewen them
            then the score will be added 100 points
            */
            if (distance < Dots[j].radius + projectileArray[i].radius){
                console.log('detected')
                //If the radius of the dots is greater than 20
                // their radius will be divided by 2
                if(Dots[j].radius > 20){
                    Dots[j].radius = Math.floor(Dots[j].radius/2);
                    projectileArray.splice(i, 1);
                }
                // Otherwise, nothing happens
                else{
                    score += 100;
                    display_score.innerHTML = score;
                    Dots.splice(j, 1);
                    projectileArray.splice(i, 1);
                }
            }
            if((Dots[j].y - Dots[j].radius) > 400){
                console.log('Removed');
                lives -= 1;
                display_lives = lives;
                Dots.splice(j, 1);
            }
        }
                
    }
}
    





