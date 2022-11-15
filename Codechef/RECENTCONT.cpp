#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, a=0, b=0;
  cin>>n;
  
  string s[n];
  
  for(int i=0; i<n; i++){
    cin>>s[i];
    
    (s[i]=="START38")? a++: b++;
  }
  
  cout<<a<<" "<<b<<endl;
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