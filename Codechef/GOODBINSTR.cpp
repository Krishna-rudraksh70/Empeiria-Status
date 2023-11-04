#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    string s;
    cin>>s;
    int n=s.length();
      
    if(s[0]==s[n-1]) cout<<n-2<<endl;
    else cout<<2<<endl;
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