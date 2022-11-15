#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n;
  cin>>n;
  
  string s;
  cin>>s;
  
  for(int i=0; i<n; i++){
    s[i] = (s[i]=='A')?'T':(s[i]=='T')?'A':(s[i]=='C')?'G':'C'; 
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