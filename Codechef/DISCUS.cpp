#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int a, b, c;
  cin>>a>>b>>c;
  
  cout<<max(a, max(b,c))<<endl;
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