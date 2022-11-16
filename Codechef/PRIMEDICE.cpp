#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define freq(i, a, b) for(int i=a; i<=b; i++)

int prime(int n){
  if(n==2)
    return 1;
  
  freq(i, 2, sqrt(n))
    if(n%i == 0)
      return 0;
      
  return 1;
  
}

void sol(){
  int n, m;
  cin>>n>>m;
  
  cout<<((prime(n+m))?"Alice":"Bob")<<endl;
}

int main(){

    ios_base::sync_with_stdio (false);
    cin.tie(NULL);cout.tie(NULL);

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}