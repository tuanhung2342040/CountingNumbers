let ctx = document.getElementById('myCanvas').getContext('2d');
let bn1 = document.getElementById('button1');
let CursorX = document.getElementById('xcoord');
let CursorY = document.getElementById('ycoord');
bn1.addEventListener('click', startGame);
myCanvas.addEventListener('click', clickDot);
let timerId; 
let radius = 20;
function randomXOrY(){
    let random = 30*(Math.random()-0.5);
    return random;
}
let dotX;
let dotY;
let speed = Math.floor(Math.random()*301 + 100);
function startGame(){
    dotX = randomXOrY();
    dotY = randomXOrY();
    if(timerId == null){
        timerId = setInterval(moveDot, 100);  
    }
}
function moveDot(){
    ctx.clearRect(0, 0, 600, 600);
    ctx.save();
    ctx.beginPath();
    ctx.arc(dotX + 300, dotY + 300, radius, 0, 2*Math.PI);
    ctx.fillStyle = 'green';
    ctx.fill();
    dotX += dotX;
    dotY += dotY;
    ctx.restore();
    if(dotX > 1300 || dotX < -1300 && dotY < -1300 || dotY > 1300 ){
        alert('Oops! The dot has escaped!');
        clearInterval(timerId);
        timerId = null;
    }
}
function clickDot(e){
    let clickX = e.offsetX;
    let clickY = e.offsetY;
    CursorX.innerHTML = clickX;
    CursorY.innerHTML = clickY;
    let distance = Math.sqrt((clickX - dotX - 300)**2 + (clickY - dotY - 300)**2);
    if (distance <= radius){
        alert('Bingo! The dot is caught and will disappear.')
        ctx.clearRect(0, 0, 600, 600);
        clearInterval(timerId);
        timerId = null;
    }
}
addEventListener