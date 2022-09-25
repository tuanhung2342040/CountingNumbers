let ctx = document.getElementById('myCanvas').getContext('2d');
let button1 = document.getElementById('button1');
let timerID;
let i = 0;
button1.addEventListener('click', moveDot);
function moveDot(){
    if(timerID == null){
        timerID = setInterval(drawDot, 100);
    }
}
function drawDot(){
    ctx.save();
    ctx.beginPath();
    ctx.strokeStyle = 'blue';
    ctx.translate(300, 200);
    ctx.rotate(i*Math.PI/180);
    ctx.arc(100, 0, 5, 0, 2*Math.PI);
    i+= 10;
    ctx.fillStyle = 'blue';
    ctx.fill();
    ctx.restore();
}