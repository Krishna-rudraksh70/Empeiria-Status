#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  string s;
  cin>>s;
  vector <int> v(2, 0);

  for(int i=0;i<s.length();i++)
    v[s[i]-'0']++;
    
  (v[0]==1 || v[1]==1)?cout<<"Yes\n":cout<<"No\n";
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}