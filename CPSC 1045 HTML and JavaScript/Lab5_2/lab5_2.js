let box1 = document.getElementById('box1');
let box2 = document.getElementById('box2');
let box3 = document.getElementById('box3');
let bn1 = document.getElementById('bn1');
let bn2 = document.getElementById('bn2');
let p = document.getElementById('pa');

bn1.addEventListener('click', getInputForBox1);
let currentCredits = 0;
function getInputForBox1(){
    if(!isNaN(box1.value) && box1.value >= 0){
        box3.value = Number(box1.value) + Number(currentCredits);
        currentCredits = Number(box3.value);
    }
    else{
        alert('Your input is not valid');
    }
}
bn2.addEventListener('click', playGame);

function playGame(){
    if(!isNaN(box2.value) && box2.value >= 0){
        if(Number(box2.value) > Number(currentCredits)){
            alert('The number cannot be greater than the credits!')
        }
        else{
            randomNum = Math.floor(Math.random() * 100 + 1);
            if(randomNum >= 1 && randomNum <= 40 ){
                box3.value = Number(currentCredits) + Number(box2.value);
                currentCredits = Number(box3.value);
                p.innerHTML = 'You win!';
            }
            else{
                box3.value = Number(currentCredits) - Number(box2.value);
                currentCredits = Number(box3.value);
                p.innerHTML = 'You lose!';
            }
        }

    }
    else{
        alert('Your input is not valid');
    }
}
