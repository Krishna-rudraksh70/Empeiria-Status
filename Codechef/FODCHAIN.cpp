#include<bits/stdc++.h>
using namespace std;

void sol(){
    
    int e, k, lvl=0;
    cin>>e>>k;
    
    while(e){
        e /= k;
        
        lvl++;
    }
    
    cout<<lvl<<endl;
    
}

int main(){
  int n;
  cin>>n;
  
  while(n-- > 0)
    sol();
  
  return 0;
}