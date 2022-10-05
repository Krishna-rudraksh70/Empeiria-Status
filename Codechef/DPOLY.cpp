#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int krishna(int n, int arr[]){
    
        for(int i=n-1; i>=0; i--){
        if(arr[i]!=0)
            return i;
    }
}

void sol(){
    
    int n;
    cin>>n;
    
    int arr[n];
    
    for(int i=0; i<n; i++)
        cin>>arr[i];
        
    cout<<krishna(n, arr)<<endl;
    
    
}

int main(){
  int t;
  cin>>t;
  
  while(t-- > 0)
    sol();
  
  return 0;
}