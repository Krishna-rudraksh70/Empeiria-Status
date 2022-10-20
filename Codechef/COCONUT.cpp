#include <iostream>

#include<bits/stdc++.h>

using namespace std;

void sol(){
  
  int xa, xb, a, b;
  cin>>xa>>xb>>a>>b;
  
  cout<<(a/xa) + (b/xb)<<endl;
    
}

int main(){
  
  int t;
  cin>>t;
  
  while(t-- > 0)
    sol();
  
  return 0;
}