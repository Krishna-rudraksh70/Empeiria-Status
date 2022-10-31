#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int x, y;
    cin>>x>>y;
    
    (x>y)?cout<<x-y<<endl:cout<<0<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}