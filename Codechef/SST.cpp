#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, m;
  cin>>n>>m;
  
  n = n/0.1;
  m = m/0.2;
  
  cout<<((n==m)?"ANY":(n>m)?"FIRST":"SECOND")<<endl;
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