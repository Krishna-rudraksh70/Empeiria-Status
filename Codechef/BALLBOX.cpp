#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    float n, m;
    cin>>n>>m;
    
    m = m*(m+1)/2;
    
    string s = (n >= m)? "YES":"NO";
  
    cout<<s<<endl;
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