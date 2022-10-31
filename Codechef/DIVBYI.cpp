#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define fre(i, a, b) for(int i = a; i<=b; i++)

void sol(){
    int n, x, y;
    cin>>n;

    x = (n/2) +1;
    y = x-1;
    fre(i, x, n){
        cout<<i<<" ";
        if(y>0)
            cout<<y<<" ";
        y--;
    }
    cout<<endl;
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}