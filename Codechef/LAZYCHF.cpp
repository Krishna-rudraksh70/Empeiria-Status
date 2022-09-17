#include<iostream>
#include<bits/stdc++.h>
using namespace std;


void sol()
{
    int x, m, d;

    cin>>x>>m>>d;

    int nim = min(x*m, x+d);
    cout<<nim<<endl;
}

int main()
{
    int n;
    cin>>n;

    while(n--)
        sol();

    return 0;
}