#include<iostream>
#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

void sol(){
    ll a, b, c, p, q, r;
    cin>>a>>b>>c>>p>>q>>r;

    ll n = (p+q+r)/2;
    
    (p+b+c > n)? cout<<"YES\n": (a+q+c > n)?  cout<<"YES\n": (a+b+r > n)? cout<<"YES\n": cout<<"NO\n";
    
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}