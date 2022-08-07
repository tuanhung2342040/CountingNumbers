// get input box1 and assign to bx1
let box1 = document.getElementById('box1');
// get button button1 and assign to bn1
let bn1 = document.getElementById('button1');
// get paragraph p1 and assign to p1
let p1 = document.getElementById('p1');
// add event listener to bn1 with 'click' event and checkNum function as handler function
bn1.addEventListener('click', checkNum);

//define checkNum() function
/*
use if...else and isNaN() function to check whether the input is a number
if it is number call checkNumif() or checkNumSwitch() function
if it is not a number, show the 'Your input is not a number.' as the content of the p1
*/
function checkNum(){
    if(isNaN(box1.value)){
        p1.innerHTML = 'It is not a number'
    }
    else
        checkNumIf();

}


//define checkNumIf() function
/*
use if...else if...else to verify whether the number is in the range, whether it is even or odd. Hint: oddNumber % 2 = 1
*/
function checkNumIf(){
    if(box1.value >= 1 && box1.value <=5){
        if(box1.value % 2 !== 0){
            p1.innerHTML = 'It is an odd number'
        }
        else{
            p1.innerHTML = 'It is an even number'
        }
    }
    else{
        p1.innerHTML = 'It is not a number in the given range';
    }
}


//define checkNumSwitch() function
/*
use switch to show whether the number in the required range is even or odd 
otherwise use p1.innerHTML to show 'It is not a number in the given range.'
*/
function checkNumSwitch(){
    switch(box1.value >= 1 && box1.value <=5){
        case true:
            switch(box1.value % 2 === 0){
                case true:
                    p1.innerHTML = 'It is an even number';
                    break;
                default:
                    p1.innerHTML = 'It is an odd number';
            }
            break;
        default:
            p1.innerHTML = 'It is not a number in the given range.'        
    }
}






