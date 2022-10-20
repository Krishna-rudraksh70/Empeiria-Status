#include <iostream>
#define lli long long int
#include<bits/stdc++.h>

using namespace std;

void sol(){
  
  lli n, c=0;
  cin>>n;
  
  for(lli i=5; i<=n; i=i*5)
    c += int(n/i);
    
  cout<<c<<endl;
    
}

int main(){
  
  int t;
  cin>>t;
  
  while(t-- > 0)
    sol();
  
  return 0;
}