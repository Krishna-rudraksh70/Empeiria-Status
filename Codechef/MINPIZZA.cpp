#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int n, x;
    cin>>n>>x;

    cout<<((n*x)/4) + ((n*x)%4!=0)<<endl;
    
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}