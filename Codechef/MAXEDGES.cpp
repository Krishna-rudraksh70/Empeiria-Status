#include<iostream>
#include<bits/stdc++.h>
using namespace std;

typedef long long int lli;

void sol(){
  lli n, k, l;
  cin>>n>>k>>l;
  
  n -= k+l;
  
  if(n<0){
      n = abs(n);
      l -= n;
      k -= n;
      n = 0;
  }
  
  lli kri = k*(n+l)+(n*l)+(n*(n-1))/2;
  
  cout<<kri<<endl;
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