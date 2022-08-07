ctx = document.getElementById('myCanvas').getContext('2d');
function drawShape(){
    ctx.save();
    ctx.beginPath();
    ctx.translate(300, 300);
    //ctx.rotate(-Math.PI/2);
    ctx.arc(20, 0,Math.sqrt(3) * 20, -Math.PI/2, Math.PI/2);
    for(let i = 0; i <=1; i++){
        ctx.rotate(120*Math.PI/180);
        ctx.arc(20, 0, Math.sqrt(3) * 20, -Math.PI/2, Math.PI/2);
    }
    /*ctx.rotate(120*Math.PI/180);
    ctx.arc(20, 0, Math.sqrt(3) * 20, -Math.PI/2, Math.PI/2);
    ctx.rotate(120*Math.PI/180);
    ctx.arc(20, 0, Math.sqrt(3) * 20, -Math.PI/2, Math.PI/2);*/
    ctx.stroke();
}
drawShape();


