#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n,x;
  cin>>n>>x;
  
  cout<<((n%3==0)? ((n/3)*2*x):((n/3)*2*x)+(n%3)*x)<<endl;
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