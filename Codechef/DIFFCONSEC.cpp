#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, c=0;
  cin>>n;
  
  string s;
  cin>>s;
  
  for(int i=0; i<n-1; i++){
      if(s[i] == s[i+1])
        c++;
  }
  
  cout<<c<<endl;
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