#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    char a, b;
    cin>>a>>b;
    
    a = (a=='R'||b=='R')?'R':(a=='B'||b=='B')?'B':'G';
  
    cout<<a<<endl;
}

int main(){

    ios_base::sync_with_stdio (false);
    cin.tie(NULL);cout.tie(NULL);

    sol();

    return 0;
}