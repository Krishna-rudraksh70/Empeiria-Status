#include<iostream>
#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

unordered_map<ll, ll> m;
ll mod = 1e9+7;

ll fact(ll n){
    if(n == 1 || n == 0)
        return 1;
    
    if(m.find(n) != m.end())
        return m[n];
        
    return m[n] = n%mod * fact(n-1)%mod;
}

ll solve(vector<ll> &num, int n){
    ll k = 0;
    for(int i=0; i<n; i++)
        k = (k+fact(num[i])%mod)%mod;
        
    return k%mod;
}

void sol(){
    int m;
    cin>>m;
    
    vector<ll> num(m);
    
    for(int i=0; i<m; i++)
        cin>>num[i];
        
    cout<<solve(num, m)<<endl;
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