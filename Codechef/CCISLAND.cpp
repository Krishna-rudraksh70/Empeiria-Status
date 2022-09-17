#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol()
{
    int x, y, xk, yk, d;

    cin>>x>>y>>xk>>yk>>d;

    int m = min(x/xk, y/yk);

    if(m >= d)
        cout<<"YES\n";
    else
        cout<<"NO\n";
}

int main()
{
    int n;
    cin>>n;

    while(n--)
        sol();

    return 0;
}