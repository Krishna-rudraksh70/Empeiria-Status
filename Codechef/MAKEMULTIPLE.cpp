#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int a, b;
    cin>>a>>b;
    
    if(b%a)
        (b>2*a)? cout<<"YES"<<endl : cout<<"NO"<<endl;
    else
        cout<<"YES"<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}