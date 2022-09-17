#include<bits/stdc++.h>
using namespace std;

void sol(){
    
    int N;
    cin>>N;
    
    if(N==1)
        cout<<3<<endl;
    else
        cout<<2<<string(N-2, '0')<<1<<endl;
    
}

int main(){
  int n;
  cin>>n;
  
  while(n-- > 0)
    sol();
  
  return 0;
}