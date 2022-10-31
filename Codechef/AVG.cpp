#include <iostream>
#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
#define fr(i, a, b) for(int i=a; i<b; i++)

void sol()
{
    ll n, k, v, s=0;
    cin>>n>>k>>v;
    
    int a[n];
    
    fr(i, 0, n){
        cin>>a[i];
        s += a[i];
    }
    
    v = (n+k)*v;
    
    if((v-s)%k==0 && s < v)
    cout<<(v-s)/k<<endl;
    else
    cout<<-1<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}