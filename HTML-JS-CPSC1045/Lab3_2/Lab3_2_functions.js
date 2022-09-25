function getSeconds(){
    //Write code here to ask your user to enter a number(0-23) for the hour of the current time, convert to number
    let hour = parseInt(prompt('Enter a number(0-23) for the hour of the current time'));
    //Write code here to ask your user to enter a number(0-59) for the minute of the current time, convert to number
    let minute = parseInt(prompt('Enter a number(0-60) for the minute of the current time'));
    parseInt(minute);
    //Write code here to ask your user to enter a number(0-59) for the second of the current time, convert to number
    let second = parseInt(prompt('Enter a number(0-60) for the second of the current time'));
    parseInt(second);
     //Write code here to calculate the total seconds
    let totalSecond = (hour*3600) + (minute*60) + second;
    //Write code here to use alert to show the result
    alert('The current time ' + hour + ':' + minute + ':' + second + ' is ' + totalSecond + ' seconds after 12:00AM');
    
}

function getHMS(){
    //Write code here to ask users' input of the seconds, covert to number
    let seconds = parseInt(prompt('Enter a number(0-86399) for the seconds'));
    //Write code here to calculate the number of hour, minute, and secods
    let temp = seconds;
    let realTime;
    let hours = Math.floor((temp/3600));
    temp %= 3600;
    let minutes = Math.floor(temp/60);
    temp %= 60;
    let newSeconds = temp;
    //Write code here to use alert to show the result
    alert(seconds + ' seconds after 12:00AM is ' + hours + ':' + minutes + ':' + newSeconds + '.');
  
}

function calculateFreeFallTime(height, intialVelocity, gravity){
     //Write code here to calculate the fall time of the object
    let fallTime = ((Math.sqrt(intialVelocity**2+2*gravity*height) - intialVelocity)/gravity);
     //Write code here to return the result
    return fallTime;

}

function compareFreeFallTime(){
    //Write code here to ask users' input of planet name of the first planet
    let firstPlanet = prompt('Enter the name of the first plannet.');
    //Write code here to ask users' input of height of the free fall on the first planet, covert to number
    let height = parseInt(prompt('Enter the height of the free fall in meters on planet ' + firstPlanet));
    //Write code here to ask users' input of initial downward velocity, covert to number
    let initialVerlocity = parseInt(prompt('Enter the initial downward velocity in meters/sec on planet ' + firstPlanet)); 
    //Write code here to ask users' input of gravity of the first planet, covert to number
    let gravity = parseInt(prompt('Enter the gravity in meters/sec^2 on planet ' + firstPlanet));
    //Write code here to ask users' input of planet name of the second planet
    let secondPlanet = prompt('Enter the name of the second planet.');
    //Write code here to ask users' input of height of the free fall on the second planet, covert to number
    let height2 = parseInt(prompt('Enter the height of the free fall in meters on planet ' + secondPlanet));
    //Write code here to ask users' input of initial downward velocity, covert to number
    let initialVerlocity2 = parseInt(prompt('Enter the initial downward velocity in meters/sec on planet ' + secondPlanet));
    //Write code here to ask users' input of gravity of the second planet, covert to number
    let gravity2 = parseInt(prompt('Enter the gravity in meters/sec^2 on planet ' + secondPlanet));
    /* Write code here to call the calculateFreeFallTime(height, intialVelocity, gravity) function to 
    calculate the fall time of an object on the first planet */
    let fallTimeFirstPlanet = Number(calculateFreeFallTime(height, initialVerlocity, gravity)).toFixed(1);
    /* Write code here to call the calculateFreeFallTime(height, intialVelocity, gravity) function to 
    calculate the fall time of an object on the second planet */
    let fallTimeSecondPlanet = Number(calculateFreeFallTime(height2, initialVerlocity2, gravity2)).toFixed(1);
    //Write code here to use alert to show the results 
    alert('The free fall time of an object on planet ' + firstPlanet + ' without air from the height of ' +  
    height + ' with initial downward velocity of ' + initialVerlocity + ' is approximately ' + fallTimeFirstPlanet + 
    ' seconds, while the free fall time of an object on planet ' + secondPlanet + ' without air from the height of ' + height2 +
    ' with initial downward velocity of ' + initialVerlocity2 + ' is approximately ' + fallTimeSecondPlanet + ' seconds.'
    );
}

