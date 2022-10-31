#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int n,x,y;
    cin>>x>>y>>n;
    
    (n>=x && n<y)?cout<<"YES\n":cout<<"NO\n";
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}