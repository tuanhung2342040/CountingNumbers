// Get elements and add event listener here, define needed variables
let bx1 = document.getElementById('box1');
let bn1 = document.getElementById('button1');
let p1 = document.getElementById('p1');
bn1.addEventListener('click', getWeather)
let bx2 = document.getElementById('box2');
let bn2 = document.getElementById('button2');
let p2 = document.getElementById('p2');
bn2.addEventListener('click', getClothes);


// Create the weather and temperature related function

function sunnyOrrainy(){
    let weather = '';
    let random = Math.floor(Math.random() * 100 + 1);
    
    if(random >= 1 && random <=50)
        weather = 'sunny';
    else 
        weather = 'rainy'
    return weather;
}
function getTemps(){
    let randomTemp = Math.round((Math.random() * 21 + 5) * 10.0)/10.0;
    return randomTemp;
}
let weather1 = sunnyOrrainy();
let temperature = getTemps();
function getWeather(){
    p1.innerHTML = "The current forecast of "+ box1.value + " is " + weather1 + " and the average temperature is predicted to be " + temperature + ' degrees';
}


// Create the clothes recommendation function

function getClothes(){
    let option = bx2.value.toLowerCase();
    if(option === 'light' || option === 'warm'){
        if(weather1 === 'rainy'){
            if(option === 'light'){
                p2.innerHTML = 'Thin waterproof jacket is recommended.'
            }
            else{
                p2.innerHTML = 'Raincoat is recommended.';
            }
        }
        else{
            if(option === 'warm'){
                if(temperature > 15){
                    p2.innerHTML = 'Hoodie is recommended.';
                }
                else
                    p2.innerHTML = 'Wool jacket is recommended.';
            }
            else{
                if(temperature > 15){
                    p2.innerHTML = 'T-shirt is recommended.';
                }
                else{
                    p2.innerHTML = 'Long sleeve is recommended.';
                }
            }
        }
    }
    else{
        alert('Something went wrong.');
    }
}


