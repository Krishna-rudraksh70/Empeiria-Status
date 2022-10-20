#include <iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  
  int a, b, x;
  cin>>a>>b>>x;

  cout<<int((b-a)/x)<<endl;
    
}

int main(){
  int t;
  cin>>t;
  
  while(t-- > 0)
    sol();
  
  return 0;
}