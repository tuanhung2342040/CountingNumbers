// Register events by adding event listeners and make functions to handle the events here
let box1 = document.getElementById('box1');
let box2 = document.getElementById('box2');
let b1 = document.getElementById('button1');
let b2 = document.getElementById('button2');
let b3 = document.getElementById('button3');
let b4 = document.getElementById('button4');
let b5 = document.getElementById('button5');
let box3 = document.getElementById('box3');
b1.addEventListener('click', addNum);
function addNum(){
    box3.value = Number(box1.value) + Number(box2.value); 
}
b2.addEventListener('click', subtractNum);
function subtractNum(){
    box3.value = Number(box1.value) - Number(box2.value); 
}
b3.addEventListener('click', mulNum);
function mulNum(){
    box3.value = Number(box1.value)*Number(box2.value); 
}
b4.addEventListener('click', divNum);
function divNum(){
    box3.value = Number(box1.value)/Number(box2.value); 
}
b5.addEventListener('click', powerNum);
function powerNum(){
    box3.value = Number(box1.value)**Number(box2.value); 
}