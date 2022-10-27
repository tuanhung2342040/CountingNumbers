let t = 13;
let clothes = 'not known';
if (t > 28) {
    console.log('It is hot!');
    clothes = 'shirt';
} else if ( t > 15 ) {
    console.log('It is not hot, and it is warm.');
    clothes = 'hoodie';
} else {
    console.log('It is not warm.');
    clothes = 'jacket';
}
console.log('The decision for clothes is ' + clothes + '.');


