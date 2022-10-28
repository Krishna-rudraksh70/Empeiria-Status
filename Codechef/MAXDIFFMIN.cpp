#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int a, b, c;
    cin>>a>>b>>c;
    
    cout<<((max(a,max(b,c)))-(min(a,min(b,c))))<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}