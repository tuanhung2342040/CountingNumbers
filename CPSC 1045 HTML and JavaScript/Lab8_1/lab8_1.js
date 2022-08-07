let c = document.getElementById('myCanvas');
let ctx = c.getContext('2d');
let bx1 = document.getElementById('box1');
let bn1 = document.getElementById('button1');
let bn2 = document.getElementById('button2');
bn1.addEventListener('click', paintDots);
bn2.addEventListener('click', paintStars)
function clear(){
    ctx.clearRect(0, 0, 800, 400);
}
function paintDots(){
    clear();
    if(isNaN(bx1.value)){
        alert('Your input is invalid');
    }
    else{
        if (bx1.value < 1 || bx1.value > 100){
            alert('Your input is invalid');
        }
        else{
            for(let i = 1 ; i <= bx1.value; i++){
                dotsRadius = Math.floor(Math.random()*46 + 5);
                x = Math.floor(Math.random() * 801 + dotsRadius);
                y = Math.floor(Math.random() * 401 + dotsRadius);
                ctx.beginPath();
                ctx.save();
                ctx.moveTo(x + dotsRadius, y);
                ctx.arc(x, y, dotsRadius, 0, 2*Math.PI);
                rgb = 'rgb(' + Math.floor(Math.random() * 256) + ',' +
                Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')';
                ctx.fillStyle = rgb;
                ctx.strokeStyle = rgb;
                ctx.fill();
                ctx.stroke();
                ctx.restore();
            }
        }
    }
}
function paintStars(){
    clear();
    if(isNaN(bx1.value)){
        alert('Your input is invalid');
    }
    else{
        if (bx1.value < 1 || bx1.value > 100){
            alert('Your input is invalid');
        }
        else{
            for(let i = 1; i <= bx1.value; i++){
                bigRadius = Math.floor(Math.random()*46 + 5);
                smallRadius = 1/4 * bigRadius;
                a = Math.floor(Math.random() * 801 + bigRadius);
                b = Math.floor(Math.random() * 401 + bigRadius);
                ctx.beginPath();
                ctx.save();
                ctx.translate(a, b);
                ctx.rotate(-Math.PI/2);
                ctx.moveTo(bigRadius, 0);
                for(let j = 0; j < 4; j++){
                ctx.rotate(Math.PI/4);
                ctx.lineTo(smallRadius, 0);
                ctx.rotate(Math.PI/4);
                ctx.lineTo(bigRadius, 0);
                }
                rgb = 'rgb(' + Math.floor(Math.random() * 256) + ',' +
                Math.floor(Math.random() * 256) + ',' + Math.floor(Math.random() * 256) + ')';
                ctx.fillStyle = rgb;
                ctx.strokeStyle = rgb;
                ctx.fill();
                ctx.stroke();
                ctx.restore();
            }
        }
    }
}
                



