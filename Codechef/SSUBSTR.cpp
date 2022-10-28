#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int n, re = 0;
    cin>>n;
    
    string s;
    cin>>s;
    
    for(int i=1; i<n; i++)
        if(s[i]=='0' && s[i-1]=='1')
            re++;
        
    cout<<re<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}