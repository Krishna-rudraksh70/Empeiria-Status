#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n;
  cin>>n;
  
  int arr[n];
  int mx = INT_MIN;
  
  for(int i=0; i<n; i++){
      cin>>arr[i];
      mx = max(arr[i], mx);
  }
  
  cout<<mx<<endl;
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