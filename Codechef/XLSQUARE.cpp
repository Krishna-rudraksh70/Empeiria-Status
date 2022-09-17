#include<bits/stdc++.h>
using namespace std;

void sol(){
    
    int n, a, v=0;
    cin>>n>>a;
    
    while((v+1)*(v+1) <= n)
        v++;
        
    cout<<v*a<<endl;
    
}

int main(){
  int n;
  cin>>n;
  
  while(n-- > 0)
    sol();
  
  return 0;
}