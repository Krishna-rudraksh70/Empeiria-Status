#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int x, y, z, kri=0;
  cin>>x>>y>>z;
  
  kri = (x%3==0)? (x*y) + ((x/3 -1)*z) : (x*y) + ((x/3)*z);
  
  cout<<kri<<endl;
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