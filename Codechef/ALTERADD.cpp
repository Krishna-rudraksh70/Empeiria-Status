#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int a, b;
    cin>>a>>b;
    
    int kri = (b-a)%3;
    
    (kri==0 || kri==1)?  cout<<"YES\n" : cout<<"NO\n";
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}