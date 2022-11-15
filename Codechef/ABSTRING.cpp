#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, t=0;
  cin>>n;
  
  string s;
  cin>>s;
  
  map<char, int> mp;
  
  if((s.size())%2==1)
    cout<<"NO\n";
  else{
      for(int i=0; i<s.size(); i++){
          mp[s[i]]++;
      }
      
      for(auto i:mp){
          if(i.second%2){
              t = 1;
              cout<<"NO\n";
              break;
          }
      }
      
      if(!t)
        cout<<"YES\n";
  }
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