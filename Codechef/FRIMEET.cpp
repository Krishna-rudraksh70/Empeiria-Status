#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int x, y;
  cin>>x>>y;
  
  if(y>x){
      cout<<"NO"<<endl;
      return;
  }
  else
      cout<<"YES\n";
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