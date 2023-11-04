#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int n,m,x,y,z;
    cin>>n>>m>>x>>y>>z;
  
    cout<<((n-m >= x+y+z)? "YES":"NO")<<endl;
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