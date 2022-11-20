#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, s=0;
  cin>>n;
  
  int a[n];
  
  for(int i=0; i<n; i++){
      
      cin>>a[i];
      
      if(a[i-1]==a[i])
        continue;
      
      s++;
  }
  
  cout<<s<<endl;
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