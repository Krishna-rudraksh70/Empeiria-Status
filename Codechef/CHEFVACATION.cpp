#include<bits/stdc++.h>
using namespace std;

void sol(){
  int x, y, z;
  cin>>x>>y>>z;
  
  cout<<(x+y<=z? "YES" : "NO")<<endl;
}

int main(){
  int n;
  cin>>n;
  
  while(n-- > 0)
    sol();
  
  return 0;
}