#include <iostream>
using namespace std;

void cout(int n){
    if(n >= 0){
        cout << n << " " << endl;
        cout(n - 1);
    }
}

int main()
{
    cout(5);
    return 0;
}