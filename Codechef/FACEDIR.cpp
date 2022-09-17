#include <bits/stdc++.h>
using namespace std;

void sol()
{
    string k[5] = {"North", "East", "South", "West"};
    
    long int n;
    cin>>n;
    
   
    cout<<k[n%4]<<endl;
}

int main()
{
    int n;
    cin>>n;
    
    while(n--)
        sol();
    
    return 0;
}