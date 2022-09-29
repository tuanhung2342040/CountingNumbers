let ctx = document.getElementById('myCanvas').getContext('2d');
let bn1 = document.getElementById('button1');
let box1 = document.getElementById('box1');
bn1.addEventListener('click', runAnimation);
let timerID;
let dotX = [];
let dotY = [];
let dotMX = [];
let dotMY = [];
let dotColor = [];
function runAnimation(){
    for(let i = 0; i < box1.value;i++){
        let randomMovementX = 20*(Math.random()-0.5);
        let randomMovementY = 20*(Math.random()-0.5);
        dotX[i] = 400;
        dotY[i] = 250;
        dotMX[i] = randomMovementX;
        dotMY[i] = randomMovementY;
        dotColor[i] = 'rgb(' + Math.floor(Math.random()
    * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256)
    + ')';
    }
    if(timerID == null){
        timerID = setInterval(moveDot, 100);
    }
}
function moveDot(){
    ctx.clearRect(0, 0, 800, 500);
    for(let i = 0; i < box1.value; i++){
        console.log(dotX[i], dotY[i]);
        console.log(dotMX[i], dotMY[i]);
        ctx.beginPath();
        ctx.strokeStyle = dotColor[i];
        ctx.arc(dotX[i], dotY[i], 5, 0, 2*Math.PI);
        ctx.fillStyle = dotColor[i];
        ctx.fill();
        dotX[i] += dotMX[i];
        dotY[i] += dotMY[i];
    }
}



