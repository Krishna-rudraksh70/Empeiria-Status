#include <bits/stdc++.h>
using namespace std;

void sol()
{
    long int n, s;
    cin>>n>>s;
    
    (n%s == 0)?cout<<n/s<<endl:cout<<int(n/s)+1<<endl;
}

int main()
{
    int n;
    cin>>n;
    
    while(n--)
        sol();
    
    return 0;
}