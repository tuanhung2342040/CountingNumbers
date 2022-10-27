function calculateYears() {
    let a = prompt('Please enter a number');
    let futureYear = parseInt(a) + 2022; // error in this line, Hint: assignment order
    let pastYear = 2022 - a; // error in this line, Hint: assignment order
    alert(a +  ' years from now is year '  + futureYear +  ', and '  + a +  ' years ago was year '  + pastYear +'.');
    // find and errors in this function to show the correct message like ' 3 years from now is year 2025, and 3 years ago was year 2019.'
    // Double check the result
}

function rollDice(){
   
    //Write code here to get a random integer from 1 and 6
    let randomInt = Math.floor(Math.random() * 6 + 1);
    //Use alert() to show the result as 'The point you get this time is INTEGER'
    alert('The point your get this time is ' + randomInt);

}

function getVolumeOfSphere() {

    //Write code here to ask your user to input the radius of the sphere with message 'Please enter the radius of the sphere in meters.'
    let radius = prompt('Please enter the radius of the sphere in meters.');
    //Write code here to calculate the volume
    let area = 4/3*Math.PI*(radius**3);
    //User alert() to to show the result as 'The volume of a sphere with radius of RADIOUS m is m^3'
    alert('The volume of a sphere with radius of ' + radius + ' m is ' + area + ' m^3');
    //Write code here to return the value
    return area;

}


