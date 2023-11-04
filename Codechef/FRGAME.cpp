#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    long n, s, r, sob;
    cin>>n>>s>>r>>sob;
  
    char k;
    
    if(n >= s)
        s += r;
    else
        n += r;
        
    if(n >= s)
        s += sob;
    else
        n += sob;
    
    if(n >= s)
        k = 'N';
    else
        k = 'S';
        
    cout<<k<<endl;
}

int main(){

    ios_base::sync_with_stdio (false);
    cin.tie(NULL);cout.tie(NULL);

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}