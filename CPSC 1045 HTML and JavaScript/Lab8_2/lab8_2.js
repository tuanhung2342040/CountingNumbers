let balance = Number(prompt('How much did you want to add? '));
function check_input(){
    while(true){
        if (isNaN(balance) || balance < 0){
            alert('Please enter a valid number');
            balance = Number(prompt('How much did you want to add? '));
        }
        else {
            alert('Your current balance is ' + balance + '. Go ahead' )
            break;
        }
    }
}
check_input();
let input = prompt('Your current balance is ' + balance + '. You can type "exit" to quit.' +
    ' To continue playing, enter a number less than or equal to you balance.');
function continuePlayingGame(){
    let play = true
    while(play && input !== 'exit' && balance !== 0){
        if (isNaN(input) || Number(input) < 0 || Number(input) > balance ){
            alert('Please enter a valid number')
            input = prompt('Your current balance is ' + balance + '. You can type "exit" to quit.' +
            ' To continue playing, enter a number less than or equal to your balance.');  
        }
        else {
            let probability = Math.random().toFixed(1);
            if (probability > 0.3){
                balance -= Number(input);
                if(balance !== 0){
                    alert('You lose! Your current balance is ' + balance + 
                    '. Take time to decide whether to continue playing.');
                    input = prompt('Your current balance is ' + balance + '. You can type "exit" to quit.' +
                    ' To continue playing, enter a number less than or equal to your balance.');
                }
                else {
                    alert('You lose. Your current balance is ' + balance +'. Your done for the game ');
                    play = false;
                }
            }
            else {
                balance += Number(input);
                alert('You win! Your current balance is ' + balance + 
                '. Take time to decide whether to continue playing.');
                input = prompt('Your current balance is ' + balance + '. You can type "exit" to quit.' +
                ' To continue playing, enter a number less than or equal to your balance.');               
            }  
        }
    }
    alert('Bye bye');
}
continuePlayingGame()


