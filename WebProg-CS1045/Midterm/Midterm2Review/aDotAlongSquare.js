let ctx = document.getElementById('myCanvas').getContext('2d');
let button1 = document.getElementById('button1');
button1.addEventListener('Click', startMovingDot);
let timeID;
let i = 0;

function drawSquare(){
    ctx.save();
    ctx.beginPath();
    ctx.rect(100, 100, 200, 200);
    ctx.stroke();
}
drawSquare();
function startMovingDot(){
    if(timeID == null){
        timeID = setInterval(drawDot, 100);
    }
}
function drawDot(){
    ctx.clearRect(0, 0, 600, 600);
    ctx.save();
    ctx.beginPath();
    ctx.arc(i, 100, 10, 0, Math.PI*2);
    i++;
    ctx.restore();
    
}
