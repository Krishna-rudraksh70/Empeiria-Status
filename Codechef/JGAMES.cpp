#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, m;
  cin>>n>>m;
  
  cout<<((abs(n-m)%2==0)? "Janmansh": "Jay")<<endl;
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