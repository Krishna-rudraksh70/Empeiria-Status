#include<iostream>
#include<bits/stdc++.h>
typedef long long ll;
using namespace std;

void sol(){
  int n;
  cin>>n;
  
  ll a[n+1] = {0};
  
  for(int i=0; i< n; i++){
      cin>>a[i];
      if(a[i] > 999)
        a[n]++;
  }
  
  cout<<a[n]<<endl;
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