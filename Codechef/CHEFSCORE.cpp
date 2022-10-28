#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int n, a, b;
    cin>>n>>a>>b;
    
    ((b%a==0) && (b/a <= n))? cout<<"YES"<<endl:cout<<"NO"<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}