#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define fr(i, a, b) for(ll i=a; i<b; i++)
typedef long long ll;

int main()
{
    ll t, m=0;
    cin>>t;
    
    ll arr[t];
    
    fr(i, 0, t){
        cin>>arr[i];
    }
    
    sort(arr, arr+t);
    
    fr(i, 0, t){
        m = max(m, (t-i)*arr[i]);
    }
    
    cout<<m<<endl;
    
    return 0;
}