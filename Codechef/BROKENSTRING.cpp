#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int n, flag = 0;
    cin>>n;
    
    string s, s1, s2;
    cin>>s;
    
    for(int i=0; i<n/2; i++)
    s1 += s[i];
    
    for(int i=n/2; i<n; i++)
    s2 += s[i];
    
    cout<<((s1==s2)? "YES":"NO")<<endl;
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