function converToMinutesSecond(){
    let user = 72
    let temp = Number(user);
    let minutes = Math.floor(temp/60);
    temp%=60;
    let seconds = temp;
    console.log(user + ' seconds is ' + minutes + ' minute ' + seconds + ' seconds');
}
converToMinutesSecond();