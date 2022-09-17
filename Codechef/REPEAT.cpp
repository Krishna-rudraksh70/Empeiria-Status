#include <bits/stdc++.h>
using namespace std;

void sol()
{
    long int n, k, s;
    cin>>n>>k>>s;
    
    cout<<(s-n*n) / (k-1)<<endl;
}

int main()
{
    int n;
    cin>>n;
    
    while(n--)
        sol();
    
    return 0;
}