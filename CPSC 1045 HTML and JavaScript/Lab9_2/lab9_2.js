let box1 = document.getElementById('box1');
let box2 = document.getElementById('box2');
let bn1 = document.getElementById('button1');
let bn2 = document.getElementById('button2');
let bn3 = document.getElementById('button3');
let bn4 = document.getElementById('button4');
let p1 = document.getElementById('p1');
let p2 = document.getElementById('p2');
let p3 = document.getElementById('p3');
bn1.addEventListener('click', addElements);
bn2.addEventListener('click', removeElements);
bn3.addEventListener('click', showElements);
bn4.addEventListener('click', reverseTheList);
list = [];
function addElements(){
    list.push(box1.value);
    p1.innerHTML = list.toString();
}
function removeElements(){
    list.pop();
    p1.innerHTML = list.toString();
}
function showElements(){
    if(list.length === 0 || box2.value > list.length){
        p2.innerHTML = "We cannot find it";
    }
    else{
        for(let i = 0; i < list.length; i++){
            p2.innerHTML = "The number " + box2.value + " element is " + list[box2.value-1];
        }
    }    
}

function reverseTheList(){
    reverseList = [];
    p3.innerHTML += "[";
    for(let i = 0; i < list.length;i++){
        reverseList[i] = list[list.length - 1 -i];
        
    }
    p3.innerHTML += reverseList.toString();
    p3.innerHTML += "]";
    
}