#include <bits/stdc++.h>
using namespace std;

void sol()
{
    long int n, s;
    cin>>n>>s;
    
    long int k = (n < s)? (2*n - s):s;
    
    cout<<k<<endl;
}

int main()
{
    int n;
    cin>>n;
    
    while(n--)
        sol();
    
    return 0;
}