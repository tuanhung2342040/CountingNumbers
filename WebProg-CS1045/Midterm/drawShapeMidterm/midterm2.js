let ctx = document.getElementById('myCanvas').getContext('2d');
ctx.save();
ctx.beginPath();
ctx.strokeStyle = 'green';
ctx.translate(300, 300);
ctx.rotate(-Math.PI/4);
ctx.arc(50, 0, 50, -Math.PI/2, Math.PI/2);
for(let i = 0; i <=2; i++){
    ctx.rotate(90*Math.PI/180);
    ctx.arc(50, 0, 50, -Math.PI/2, Math.PI/2);
}
ctx.fillStyle = "green";
ctx.fill();
ctx.stroke();