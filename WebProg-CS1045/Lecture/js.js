
let myArray = [];
for(let i = 0; i < 5; i++){
    let random = Math.random();
    myArray[i] = random;
}
console.log('The array is: ')
console.log(myArray.toString());
let largest = myArray[0];
for(let i = 1; i < myArray.length;i++){
    if(myArray[i] > largest){
        largest = myArray[i];
    }
}
console.log('The largest value in the array is ' + largest);
let index = myArray.indexOf(largest);
myArray[index] = 0;
console.log('The new array is: ');
console.log(myArray.toString());




