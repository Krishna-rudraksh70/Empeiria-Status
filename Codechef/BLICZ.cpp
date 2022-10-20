#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int n, a, b;
    cin>>n>>a>>b;
    
    cout<<(2*(180+n)) - (a+b)<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}