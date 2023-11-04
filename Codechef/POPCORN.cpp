#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    long a1, a2, b1, b2, c1, c2;
    cin>>a1>>a2;
    cin>>b1>>b2;
    cin>>c1>>c2;
    
    a1 += a2;
    b1 += b2;
    c1 += c2;
    
    a1 = (a1 > b1 && a1 > c1)? a1:(b1 > a1 && b1 > c1)? b1:c1;
  
    cout<<a1<<endl;
}

int main(){

    ios_base::sync_with_stdio (false);
    cin.tie(NULL);cout.tie(NULL);

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}