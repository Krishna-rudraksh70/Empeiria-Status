#include <bits/stdc++.h>
using namespace std;

void sol()
{
    long int a, b, c;
    cin>>a>>b>>c;
    
    if(b < c && b < a)
        cout<<"Bob\n";
    else if(a < b && a < c)
        cout<<"Draw\n";
    else
        cout<<"Alice\n";
}

int main()
{
    int n;
    cin>>n;
    
    while(n--)
        sol();
    
    return 0;
}