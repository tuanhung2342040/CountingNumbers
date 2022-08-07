// Register events by adding event listeners and make functions to handle the events here
let box1 = document.getElementById('box1');
let b1 = document.getElementById('button1');
let b2 = document.getElementById('button2');
let b3 = document.getElementById('button3');
let b4 = document.getElementById('button4');
let box2 = document.getElementById('box2');

b1.addEventListener('click', convertToUpperCase);
function convertToUpperCase(){
    box2.value = box1.value.toUpperCase();
}
b2.addEventListener('click', convertToLowerCase);
function convertToLowerCase(){
    box2.value = box1.value.toLowerCase();
}
b3.addEventListener('click', getTheLastCharacter);
function getTheLastCharacter(){
    box2.value = box1.value.slice(-1);
}
b4.addEventListener('click', removeSpaces);
function removeSpaces(){
    box2.value = box1.value.replaceAll(' ', '');
}




