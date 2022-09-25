setInterval(spinWheel, 100)
function spinWheel() {
    ctx.clearRect(0, 0, 1200, 400)
    ctx.save();
    ctx.translate(200, 200)
    ctx.rotate(i / 10 * Math.PI);
    drawWheel('red');
    ctx.rotate(2 / 3 * Math.PI);
    drawWheel('green');
    ctx.rotate(2 / 3 * Math.PI);
    drawWheel('blue');
    i++;
    ctx.restore();
}
