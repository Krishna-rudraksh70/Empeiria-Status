#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int x, y, z;
  cin>>x>>y>>z;
  
  z -= y;
  
  cout<<z/x<<endl;
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