#include<bits/stdc++.h>
using namespace std;

void sol(){
  int x, y;
  cin>>x>>y;
  
  cout<<fixed<<setprecision(6)<<max(0, 6-x-y) / 6.0<<endl;
}

int main(){
  int n;
  cin>>n;
  
  while(n-- > 0)
    sol();
  
  return 0;
}