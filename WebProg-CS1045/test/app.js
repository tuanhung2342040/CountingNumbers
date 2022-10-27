;
var name = "thanhtuan";
for (i = 0; i < name.length; i++) {
  console.log(name.charAt(i));
}
var numbers = "123456";
var alpha = "abcdef";
var newString = "";
function concat(numbers, alpha, n) {
  for (i = 0; i < numbers.length / n; i++) {
    for (j = n * i; j < n * (i + 1); j++) {
      newString += numbers[j];
    }
    for (j = n * i; j < n * (i + 1); j++) {
      newString += alpha.charAt(j);
    }
  }
  return newString;
}
// we can use numbers.charAt(j) or numbers[j]
console.log(concat(numbers, alpha, 2));

// i am creating an array that contains numbers
// using linearBinary or selectionBinary 
var num = [1, 2, 4, 10, 15, 8, 26];
var start = 0;
var end = 6;
function binarySearch(numArray, target, start, end){
    for(i = start;i<end;i++){
        if(numArray[i] == target)
            return i;
    }
    return -1;
}
var num1 = [1, 3, 5, 6, 8, 10]
function binarySearch(numArray, target, start, end){
    while(start < end){
        const middle = (start + end)/2;
        if(numArray[middle] == target)
            return middle;
        else if (numArray[middle] > target)
            end = middle;
        else
            start = middle + 1;
    }
    return -start-1;
}
var target1 = 8;
console.log(binarySearch(num, target1, start, end));
var target2 = 8;
console.log(binarySearch(num1, target2, start, end))

function testStrictNotEqual(val){
    if(val != "17")
        return "Not Equal";
    return "Equal";
}
console.log(testStrictNotEqual(17))
// === does not change the type of data: 
// == change the type of data
function caseInSwitch(val){
    var answer = "";
    switch(val){
        case 1:
            answer = "alpha";
            break;
        case 2:
            answer = "beta";
            break;
        case 3:
            answer = "mega";
            break;
        default:
            answer = "stuff";
            break;

    }
    return answer;
}
caseInSwitch(1);
function chainToSwtich(val){
    var answer = "";
    switch(val){
        case "bob":
            answer = "Marley";
            break;
        case 42:
            answer = "The answer";
            break;
        case 1:
            answer = "There is no #1";
            break;
        case 99:
            answer = "MIssed me by this much";
            break;
        defaul:
            answer = "You have done someting wrong";
            break;
        
    }
}
