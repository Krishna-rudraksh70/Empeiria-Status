#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int x, y, z;
  cin>>x>>y>>z;
  
  if(y==z)
    cout<<x<<endl;
  else{
      if(y%z==0)
        cout<<x*(y/z)<<endl;
      else
        cout<<x*(y/z+1)<<endl;
  }
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