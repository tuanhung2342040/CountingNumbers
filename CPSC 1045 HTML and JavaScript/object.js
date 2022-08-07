let pen = {
    length: 20,
    weight: 50,
    writeHello: function () {
        console.log('Hello');
    }
}
console.log(pen.length);
pen.writeHello();
console.log();

let car = {
    color: 'Black',
    make: 'Tesla', 
    year:'2020',
    model: 'S',
    accelerate: function(){
        console.log('Car accelerates');
    }
}
console.log(car.color, car.make, car.year, car.model);
car.accelerate();
console.log();

function Pen(name, length, weight){
    this.name = name;
    this.length = length;
    this.weight = weight;
    this.write = function(){
        console.log(this.name + ' is writing');
    }
}
let myPen = new Pen('myPen', 20, 100);
console.log(myPen.write());
// create a constructor function that helps to create a Car object
function Car (color, make, year, model){
    this.color = color;
    this.make = make;
    this.year = year;
    this.model = model;
    this.accelerate = function(){
        console.log(this.model + ' is accelerating')
    }
}
let myCar = new Car('Black', 'Tesla', '2020', 'S');
console.log(myCar)