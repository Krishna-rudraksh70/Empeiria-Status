#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int dec(int x, int y){
    if(x==y)
        return 2;
    return (x>y);
}

void sol()
{
    int x, y;
    cin>>x>>y;
    
    string str[] = {"FIRST", "SECOND", "ANY"};
    
    cout<<str[dec(x,y)]<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}