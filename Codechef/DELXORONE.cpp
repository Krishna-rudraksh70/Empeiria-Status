#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n;
  cin>>n;
  
  int arr[n];
  
  map<int, int> mp;
  
  for(int i=0; i<n; i++){
      cin>>arr[i];
      mp[arr[i]]++;
  }
  
  int x=0, b[n+1]={0};
  
  for(auto i:mp){
      x = max(x, i.second);
      b[i.first] = i.second;
  }
  
  int a=0;
  for(int i=0; i<n; i++){
      if(1>=(i^(i+1)))
        a = max(a, b[i]+b[i+1]);
  }
  
  a = max(a,x);
  
  
  cout<<n-a<<endl;
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