/*let reserved = 2;
let n;
let row = 3;
let col = 4;

console.log('There are ' + row * col + reserved + ' cars in the parking lot');
console.log('There are ' + row * col + reserved + ' cars in the parking lot' === 'There are 14 cars in the parking lot');
console.log('There are ' + 3 * 4 + 2 + ' cars in the parking lot' === 'There are 14 cars in the parking lot' );
console.log('There are ' + 12 + 2 + ' cars in the parking lot' === 'There are 14 cars in the parking lot' );
console.log('There are 12' + 2 + ' cars in the parking lot' === 'There are 14 cars in the parking lot');
console.log('There are 122' + ' cars in the parking lot' === 'There are 14 cars in the parking lot');
console.log('There are 122 cars in the parking lot' === 'There are 14 cars in the parking lot');
//8
let a = 3;
a += 3;
let b = 1;
b **= a;
console.log(((a >= 11) || (b <= 1)) && (a === b) );
console.log(((6 >= 11) || (b <= 1)) && (a===b));
console.log(((6 >= 11) || (1 <= 1)) && (a===b));
console.log((false || (1 <= 1)) && (a===b));
console.log((false || true) && (a===b));
console.log((false || true) && false);
console.log(true && false);
console.log(false);
//7
console.log(false || true && !false);
console.log(false || true && true);
console.log(false || true);
console.log(true);
//6
console.log('cc' > 'cd' || 2 != '2');
console.log(false || 2 != '2');
console.log(false);*/
let sum = 0
for(let i = 1; i <= 100; i++){
    sum += i;
}
console.log('The sum of all integers from 1 to 100 is: ' + sum);
let count = 0;
for(let i = 1; i <=50; i++){
    count += i + (101-i);
}
console.log(count)
let number = [];
function generateANum(){
    num = Math.random().toFixed(2);
    while(num >= 0.3){
        number.push(num);
        num = Math.random().toFixed(2);
    }
    return num;
}
a = generateANum();
console.log('The numbers that are larger than 0.3: ' );
console.log(number);
console.log('A number that is less than 0.3: ' + a);
let value = 5
function guessAnInteger(){
    let userGuess = 0;
    do {
        userGuess = Number(prompt('Get an integer'));
    } while(userGuess !==value);
    console.log('You guessed it right!');
}
guessAnInteger();



