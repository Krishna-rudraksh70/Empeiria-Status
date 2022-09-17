#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, k;
  cin>>n>>k;
  
  cout<<(n/k) + (n%k != 0)<<endl;
}

int main(){
  int n;
  cin>>n;
  
  while(n-- > 0)
    sol();
  
  return 0;
}