#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n,m,y;
  cin>>n>>m>>y;
  
  string s[2][2] = {"NONE", "CHICKEN", "DUCK", "ANY"};
  
  cout<<s[(y%m == 0)][(y%n == 0)]<<endl;
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