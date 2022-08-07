let c = document.getElementById('myCanvas');
let ctx = c.getContext('2d');
ctx.beginPath();
ctx.arc(100, 100, 50, 0.643, -0.644);
ctx.lineTo(80, 100);
ctx.lineTo(140, 130);
ctx.strokeStyle = 'yellow'
ctx.fillStyle = 'yellow';
ctx.fill();
ctx.stroke();

ctx.beginPath();
let radius = 130;
for(let i = 0; i < 3; i++){
    ctx.moveTo(radius + 5, 100);
    ctx.arc(radius, 100, 5, 0, 2*Math.PI);
    radius += 30
    ctx.strokeStyle = 'blue';
    ctx.fillStyle = 'blue';
    ctx.fill();
}
ctx.stroke();
ctx.beginPath();
for(let i = 0; i < 3; i++){
    ctx.moveTo(radius + 5, 100);
    ctx.arc(radius, 100, 5, 0, 2*Math.PI);
    radius += 30
    ctx.strokeStyle = 'red';
    ctx.fillStyle = 'red';
    ctx.fill();
}
ctx.stroke();