#include<bits/stdc++.h>
using namespace std;

void sol(){
    
    int n, a, b;
    cin>>n>>a>>b;
    
    cout<<(2*3*60 + n*2 - (a+b))<<endl;
    
}

int main(){
  int n;
  cin>>n;
  
  while(n-- > 0)
    sol();
  
  return 0;
}