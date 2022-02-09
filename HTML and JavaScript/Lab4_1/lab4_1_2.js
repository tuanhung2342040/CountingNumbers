//Solve the problem step by step.
let div1 = document.getElementById('div1');
let div2 = document.getElementById('div2');
let div3 = document.getElementById('div3');
let div4 = document.getElementById('div4');
div1.addEventListener('mouseover', changeToGreen);
div2.addEventListener('mouseover', changeToGreen);
div3.addEventListener('mouseover', changeToGreen);
div4.addEventListener('mouseover', changeToGreen);
function changeToGreen(e){
        e.target.style.backgroundColor = 'green';
}
div1.addEventListener('click', changeToBlue);
div2.addEventListener('click', changeToBlue);
div3.addEventListener('click', changeToBlue);
div4.addEventListener('click', changeToBlue);
function changeToBlue(e){
    e.target.style.backgroundColor = 'blue';
}
div1.addEventListener('mouseout', changeToWhite);
div2.addEventListener('mouseout', changeToWhite);
div3.addEventListener('mouseout', changeToWhite);
div4.addEventListener('mouseout', changeToWhite);
function changeToWhite(e){
    e.target.style.backgroundColor = '';
}

