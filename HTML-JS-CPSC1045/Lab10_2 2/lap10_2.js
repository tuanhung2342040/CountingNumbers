let ctx = document.getElementById('myCanvas').getContext('2d');
let button1 = document.getElementById('button1');
button1.addEventListener('click', startAnimation);
myCanvas.addEventListener('click', addDot);
let timerId;
let x;
let y;
let radius;
let color;
let mx;
let my;
let Dots = [];
let dot;
function Dot(x, y, radius, color, mx, my){
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.color = color;
    this.mx = mx;
    this.my = my;
    this.draw = function(){
        ctx.beginPath();
        ctx.strokeStyle = this.color;
        ctx.arc(this.x, this.y, this.radius, 0, 2*Math.PI);
        ctx.fillStyle = this.color;
        ctx.fill();
    }
}
function addDot(e){
    x = e.offsetX;
    y = e.offsetY;
    console.log(x, y);
    radius = Math.floor(Math.random()*16 + 5);
    color = 'rgb(' + Math.floor(Math.random()
    * 256) + ',' + Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256)
    + ')';
    mx = Math.floor(Math.random()*31-15);
    my= Math.floor(Math.random()*31-15);
    dot = new Dot(x, y, radius, color, mx, my);
    dot.draw(); 
    Dots.push(dot);

}
function moveDots(){
    ctx.clearRect(0, 0, 600, 400);
    for(let i = 0; i < Dots.length;i++){
        Dots[i].draw();
        Dots[i].x += Dots[i].mx;
        Dots[i].y += Dots[i].my;
        if(Dots[i].x + Dots[i].radius >= 600 || Dots[i].x + Dots[i].radius <= 0){
            Dots[i].mx = - Dots[i].mx;
        }
        if(Dots[i].y + Dots[i].radius >= 400 || Dots[i].y + Dots[i].radius <=0){
            Dots[i].my = - Dots[i].my;
        }
    }
}
function startAnimation(){
    if(timerId == null){
        timerId = setInterval(moveDots, 100);
    }
}