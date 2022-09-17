#include<iostream>
#include<bits/stdc++.h>
using namespace std;


void sol()
{
    int a,b,c,d;

    cin>>a>>b>>c>>d;

    if((min(a+c, b+d) == 180))
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