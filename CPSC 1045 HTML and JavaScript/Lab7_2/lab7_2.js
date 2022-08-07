let c = document.getElementById('canvas');
let ctx = c.getContext('2d');
let bn1 = document.getElementById('button1');
let bn2 = document.getElementById('button2');
let bn3 = document.getElementById('button3');
let bn4 = document.getElementById('button4');
let bn5 = document.getElementById('button5');
bn1.addEventListener('click', drawASmileyFace);
bn2.addEventListener('click', drawANeutralFace);
bn3.addEventListener('click', drawAFrowningFace);
bn4.addEventListener('click', drawAndMoveUpEmoji );
bn5.addEventListener('click', drawAndMoveDownEmoji);
let x = 300;
let y = 200;
let radius = 50
function drawAFace(){
    ctx.save();
    ctx.beginPath();
    ctx.arc(x, y, radius, 0, Math.PI*2);
    ctx.fillStyle = 'yellow';
    ctx.fill();
    ctx.stroke();
    ctx.beginPath();
    ctx.arc(x-15, y-10, 5, 0, 2*Math.PI);
    ctx.moveTo(x+20, y-10);
    ctx.arc(x+15, y-10, 5, 0, 2*Math.PI);
    ctx.fillStyle ='black';
    ctx.fill();
    ctx.stroke();
}
function clear(){
    ctx.clearRect(x - radius - 15, y - radius-15, radius * 2 + 30, radius * 2 + 30);
}
function smiley(){
    clear();
    drawAFace();
    ctx.beginPath(); 
    ctx.moveTo(x+30, y+10);
    ctx.arc(x, y+10, 30, 0, Math.PI)
    ctx.stroke();
}
function drawASmileyFace(){
    clear();
    x = 300;
    y = 200;
    smiley();
}
function drawANeutralFace(){
    clear();
    x = 300;
    y = 200;
    drawAFace();
    ctx.beginPath();
    ctx.moveTo(x+15, y+20);
    ctx.lineTo(x-15, y+20);
    ctx.stroke();
}
function drawAFrowningFace(){
    clear();
    x = 300;
    y = 200;
    drawAFace();
    ctx.beginPath();
    ctx.arc(x, y+20, 20, -Math.PI, 0)
    ctx.stroke();
}
function drawAndMoveUpEmoji(){
    if (y > 50)
        y -= 10;
    smiley();
    
}
function drawAndMoveDownEmoji(){
    if(y < 350)
        y += 10;
    smiley();
    
}