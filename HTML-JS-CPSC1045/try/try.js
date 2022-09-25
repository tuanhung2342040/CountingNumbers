let ctx = document.getElementById('myCanvas').getContext('2d');
let x;
let y;
let radius;
let color;
let mx;
let my;
let particles;
particlesArray = [];

function Dot(x, y, radius, color, mx, my){
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.color = color;
    this.mx = mx;
    this.my = my;
    this.draw = () =>{
        ctx.beginPath();
        ctx.arc(this.x, this.y, this.radius, 0, 2*Math.PI);
        ctx.fillStyle = this.color;
        ctx.fill();
    }
}

for(let i = 0; i < 10; i++){
    x = 300;
    y = 200;
    radius = 4;
    mx = 10*(Math.random() - 0.5);
    my = 10*(Math.random() - 0.5);
    color = 'rgb(' + Math.floor(Math.random()
    * 256) + ',' + Math.floor(Math.random() * 256) + ',' +
    Math.floor(Math.random() * 256) + ')';
    particles = new Dot(x, y, radius, color, mx, myCanvas);
    particles.draw(); 
    particleArray.push(particles);
}
myCanvas.addEventListener('click', () => {
    setInterval(() => {
        clearRect(0, 0, 600, 400);
        for(let i = 0; i < particleArray.length; i++){
            particleArray[i].draw();
            particleArray[i].x += particleArray[i].mx;
            particleArray[i].y += particleArray[i].my;
        }
    }, 100);
    
});

    

