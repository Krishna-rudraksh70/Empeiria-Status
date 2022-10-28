#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int x, y;
    cin>>x>>y;
    
    cout<<(int(x/y) + x%y)<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}