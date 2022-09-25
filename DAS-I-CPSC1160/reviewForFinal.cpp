#include <iostream>
#include <string>
using namespace std;
// sum of numbers from 1 to n
int sum(int num){
    if(num == 0){
        return num;
    }
    else{
        return (num + sum(num - 1));
    }
}
// print forward 
void printForward(int num){
    if(num == 0){
        return;
    }
    else{
        printForward(num - 1);
        cout << num << " ";
    }
}
// print backward
void printBackward(int num){
    if(num == 0){
        return;
    }
    else{
        cout << num << " ";
        printBackward(num - 1);
    }
}
// print Fibonacci
int Fibo(int num){
    if(num == 1 || num == 2){
        return 1;
    }
    else{
        return Fibo(num - 1) + Fibo(num - 2);
        cout << num << " ";
    }
}
// print the array elements
void printArray(int arr[], int n){
    if(n == 0){
        return;
    }
    else{
        // cout << n << " ";
        printArray(arr, n - 1);
        cout << arr[n - 1] << " ";
    }
}
//count the digits of a given number
int countDigits(int num){
    int count = 0;
    if(num == 0){
        return count;
    }
    else{
        count++;
        //cout << num << " ";
        countDigits(num / 10);
    }
}
// reverse a string 
string reverseString(int string, int length){
    String str = "";
    if(length == 0){
        return str;
    }
    else{
        return str += string[length];
        reverseString(string, length - 1);
    }
}
int main(){
    cout << sum(3) << endl;
    cout << "Print numbers forward: ";
    printForward(50);
    cout << endl;
    cout << "Print numbers backward: ";
    printBackward(5);
    cout << endl;

    int a = Fibo(10);
    cout << a << endl;

    int arr[10] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    printArray(arr, 6);
    cout << endl;

    cout << "The number of digits is: " << countDigits(12234) << endl;
    String b = "abcdef";
    string st = reverseString(b, b.length());
    cout << st << endl;
    return 0;
}