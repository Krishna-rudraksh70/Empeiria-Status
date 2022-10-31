#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define fr(i, a, b) for(int i = a; i< b; i++)

void sol(){
    int a, b;
    cin>>a>>b;
    
    cout<<min(a,b)<<endl;
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}