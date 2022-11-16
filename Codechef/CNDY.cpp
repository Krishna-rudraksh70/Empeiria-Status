#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define fr(i, a, b) for(int i=a; i<b; i++)

void sol(){
  int n;
  cin>>n;
  
  int arr[2*n];
  map<int, int> m;
  
  fr(i, 0, 2*n){
    cin>>arr[i];
    
    m[arr[i]]++;
  }
  
  bool flag = false;
  
  for(auto i:m)
    if(i.second >= 3){
      flag = true;
      break;
    }
    
  cout<<((flag)?"NO":"YES")<<endl;
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