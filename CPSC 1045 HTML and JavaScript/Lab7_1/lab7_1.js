let c = document.getElementById('canvas');
let ctx = c.getContext('2d');
let bn1 = document.getElementById('button1');
let bn2 = document.getElementById('button2');
bn1.addEventListener('click', drawASquare);
bn2.addEventListener('click', showAText);

ctx.save();
function drawAWheel(x, y, radius){
    ctx.save();
    ctx.beginPath();
    ctx.arc(x, y, radius, 0, 2*Math.PI);
    ctx.translate(x, y);
    ctx.arc(0, 0, 1, 0, Math.PI * 22)
    for(let i = 0; i <=7; i++){
        ctx.rotate(Math.PI/4);
        ctx.moveTo(0, 0);
        ctx.lineTo(radius, 0);
    }
    ctx.stroke();
    ctx.restore();
}
function drawAHexagon(x, y, radius){
    ctx.save();
    ctx.beginPath();
    ctx.translate(x, y);
    ctx.moveTo(radius, 0);
    for(let i = 0; i <= 5; i++){
        ctx.rotate(Math.PI/3);
        ctx.lineTo(radius,0);
    }
    ctx.stroke();
    ctx.restore();
}
function drawACar(radius){
    ctx.save();
    ctx.beginPath();
    ctx.translate(200, 40);
    ctx.moveTo(0, 40);
    ctx.lineTo(50, 40);
    ctx.lineTo(80, 0);
    ctx.lineTo(150, 0);
    ctx.lineTo(180, 40);
    ctx.lineTo(230, 40);
    ctx.lineTo(230, 80);
    ctx.lineTo(200, 80);
    ctx.translate(180, 80);
    ctx.arc(0, 0, radius, 0, 2*Math.PI);
    for(let i = 0; i <=7; i++){
        ctx.rotate(Math.PI/4);
        ctx.moveTo(0, 0);
        ctx.lineTo(radius, 0);
    }
    ctx.moveTo(0, 0);
    ctx.lineTo(-100, 0);
    ctx.translate(-120, 0);
    ctx.moveTo(0, 0);
    ctx.arc(0, 0, radius, 0, 2*Math.PI);
    for(let i = 0; i <=7; i++){
        ctx.rotate(Math.PI/4);
        ctx.moveTo(0, 0);
        ctx.lineTo(radius, 0);
    }
    ctx.moveTo(0, 0);
    ctx.lineTo(-60, 0);
    ctx.lineTo(-60, -40)
    ctx.stroke();
    ctx.restore();  
}
function drawAFourPointStar(radius){
    ctx.save();
    ctx.beginPath();
    ctx.translate(250, 200); 
    ctx.moveTo(radius, 0);
    ctx.rotate(Math.PI/4);
    for(let i = 0; i < 4; i++){
        ctx.lineTo(radius-30, 0);
        ctx.rotate(Math.PI/4);
        ctx.lineTo(radius, 0);
        ctx.rotate(Math.PI/4);
    }
    ctx.stroke();
    ctx.restore();
}
function drawAPentagram(radius){
    ctx.save();
    ctx.beginPath();
    ctx.translate(400, 200);
    ctx.rotate(-Math.PI/2);
    ctx.moveTo(radius, 0);
    for(let i = 0; i < 5; i++){
        ctx.rotate(36*Math.PI/180);
        ctx.lineTo(radius-30, 0)
        ctx.rotate(36*Math.PI/180);
        ctx.lineTo(radius, 0);
    }
    ctx.stroke();
    ctx.restore();
}

function drawASquare(){
    ctx.save();
    ctx.beginPath();
    ctx.translate(430, 150);
    ctx.moveTo(0, 0);
    ctx.strokeStyle = 'blue';
    ctx.fillStyle = 'red';
    ctx.rect(50, 0, 100, 100);
    ctx.fill();
    ctx.stroke();
    ctx.restore();
}
function showAText(){
    ctx.save();
    ctx.beginPath();
    ctx.font = "30px serif";
    ctx.fillStyle = 'yellow';
    ctx.strokeStyle = 'blue';
    ctx.fillText("Shapes are drawn!", 70, 300);
    ctx.strokeText("Shapes are drawn!", 70, 300);
    ctx.stroke();
    ctx.restore();
}



drawAWheel(100, 100, 40);
drawAHexagon(100, 200, 40);
drawACar(20)
drawAFourPointStar(40);
drawAPentagram(50);







