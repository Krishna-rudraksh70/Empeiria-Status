#include<iostream>
#include<bits/stdc++.h>
using namespace std;


void sol()
{
    int r1,r2,w1,w2,c1,c2;
    int a=0;

    cin>>r1>>w1>>c1;
    cin>>r2>>w2>>c2;

    if(r1>r2)
        a++;
    if(w1>w2)
        a++;
    if(c1>c2)
        a++;

    if(a>1)
        cout<<"A\n";
    else
        cout<<"B\n";
}

int main()
{
    int n;
    cin>>n;

    while(n--)
        sol();

    return 0;
}