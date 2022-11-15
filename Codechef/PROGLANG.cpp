#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int a, b, a1, b1, a2,b2;

int well(){
    
    if((a==a1 && b==a2) || (b==a1 && a==a2))
        return 1;
    else if((a==b1 && b==b2) || (b==b1 && a==b2))
        return 2;
    else return 0;
}

void sol(){
    cin>>a>>b>>a1>>a2>>b1>>b2;
    
    cout<<well()<<endl;
    
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}