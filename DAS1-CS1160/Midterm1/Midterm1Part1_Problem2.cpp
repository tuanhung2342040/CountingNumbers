#include <iostream>
#include <string>

using namespace std;

/**
 * Write a recursive method named EveryThird(string text) that takes 
 * a string as its parameter and outputs every third character 
 * in the string going from right to left in the format shown below.

For example,
EveryThird(“abcdefgh”) outputs f,c,
EveryThird(“abcdefghi”) outputs g,d,a,
EveryThird(“abcdefghij”) outputs h,e,b,

You are allowed to add more parameters to the function if necessary.
You are also allowed to add more methods if necessary * 
 * 
 */

void EveryThird(string text, int i) {
    
    if(i < 0){
        return;
    }
    char *arr = new char[text.length()];
    // for(int i = text.length() - 3; i >= 0; i -= 3){
    //     arr[i] = text[i];
    //     cout << arr[i] << ", ";
    // }
    arr[i] = text[i];
    cout << arr[i] << ", ";
    i -= 3;
    EveryThird(text, i);
    cout << endl;
    
}
int main(){
    string a = "abcdefgh";
	EveryThird(a, a.length() - 3); //outputs f,c,
    string b = "abcdefghi";
    EveryThird(b, b.length() - 3); //outputs g,d,a,
    string c = "abcdefghij";
    EveryThird(c, c.length() - 3); //outputs h,e,b,

    

    return 0;
}