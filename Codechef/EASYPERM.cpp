#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define frrev(i, a,b) for(int i=a; i>b; i--)

void sol(){
  int n;
  cin>>n;
  
  frrev(i, n, 0)
  cout<<i<<" ";
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