#include <iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  
  int t, l, c;
  cin>>t>>l>>c;

  cout<<min(l, t-l) * c<<endl;
    
}

int main(){
  int t;
  cin>>t;
  
  while(t-- > 0)
    sol();
  
  return 0;
}