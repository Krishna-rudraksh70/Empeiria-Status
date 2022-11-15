#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, i;
  cin>>n;
  
  int arr[n];
  int m = INT_MAX;
  
  for(i=0; i<n; i++){
      cin>>arr[i];
      if(m > arr[i])
        m = arr[i];
  }
  
  int a = 0, t = 0;
  
  for(i=0; i<n; i++){
      if(arr[i] != m){
          if(arr[i]%m == 0)
            a++;
          else{
              t = 1;
              break;
          }
      }
  }
  
  if(t)
    cout<<n<<endl;
  else
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