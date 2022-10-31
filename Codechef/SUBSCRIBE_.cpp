#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int n, x;
    cin>>n>>x;
    
    cout<<((n/6)+(n%6!=0))*x<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}