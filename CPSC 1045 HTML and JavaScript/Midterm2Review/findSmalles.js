numbers = [100, 10, 20, 500, 19, 40, 90];
function findSmallestNumber(){
    let smallest = numbers[0];
    for(let i = 1; i < numbers.length;i++){
        if(numbers[i] < smallest){
            smallest = numbers[i];
        }
    }
    return smallest;
}
console.log('The smallest number in the array is: ');
console.log(findSmallestNumber())