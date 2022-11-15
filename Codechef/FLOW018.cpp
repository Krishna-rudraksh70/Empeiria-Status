#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int fact(int n)
{
    if(n<2)
        return 1;
    
    return n*fact(n-1);
    
}

void sol(){
    int n;
    cin>>n;
    
    cout<<fact (n)<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}