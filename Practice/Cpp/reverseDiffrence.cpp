#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int num = n;
    int reverseN = 0;
    while(n>0){
        int x = n%10;
        reverseN = (reverseN*10)+x;
        n /= 10;
    }
    cout<<num - reverseN;

    return 0;
}