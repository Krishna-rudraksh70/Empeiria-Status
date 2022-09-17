#include <bits/stdc++.h>
using namespace std;

void sol()
{
    long int n, s;
    cin>>n>>s;
    
    long int x = n*(n+1)/2 - s;
    
    s =(x >0 and x <= n)? x:-1;
    
    cout<<s<<endl;
}

int main()
{
    int n;
    cin>>n;
    
    while(n--)
        sol();
    
    return 0;
}