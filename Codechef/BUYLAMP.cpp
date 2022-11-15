#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, k, a,b;
  cin>>n>>k>>a>>b;
  
  cout<<min((n*a),(k*a)+(n-k)*b)<<endl;
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