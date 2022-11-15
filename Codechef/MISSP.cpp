#include <iostream>
#include <bits/stdc++.h>
typedef long long ll;
#define fr(i, a, b) for(ll i=a; i<b; i++)
using namespace std;

void sol()
{
    ll n, x=0;
    cin>>n;
    
    int a[n];
    
    fr(i, 0, n){
        cin>>a[i];
        x ^= a[i];
    }
    
    cout<<x<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}