#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  float a, b, x, y;
  cin>>a>>b>>x>>y;
  
  a = a/x;
  b = b/y;
  
  cout<<((a>b)? "Chefina": (a<b)? "Chef":"Both")<<endl;
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