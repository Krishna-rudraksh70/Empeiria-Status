#include<bits/stdc++.h>
using namespace std;

void sol(){
  int a, b;
  cin>>a>>b;
  
  cout<<(a+b<3? "1":a+b<=10?"2":a+b<=60?"3":"4")<<endl;
}

int main(){
  int n;
  cin>>n;
  
  while(n-- > 0)
    sol();
    
  return 0;
}