#include<iostream>
#include<bits/stdc++.h>
using namespace std;
typedef long long int lli;

lli k = 998244353;

void sol(){
  lli n, t, sum=0, i, a;
  cin>>n;
  
  for(i=0; i<n; i++){
      cin>>t;
      sum += t;
      sum %= k;
  }
  
  a = (sum*(sum-1))%k;
  cout<<a<<endl;
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