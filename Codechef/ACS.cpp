#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, a;
  cin>>n;
  
  cout<<(((n%100 + n/100) <= 10)? (n%100 + n/100) : -1)<<endl;
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