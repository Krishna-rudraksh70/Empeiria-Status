#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define fre2(i, a, b) for(int i = a; i<=n; i += 2)
#define ans(n, m) ((n+1-m)*(n+1-m))

void sol(){
    int n, s=0;
    cin>>n;
    
    fre2(i, 1, n)
        s += ans(n, i);
        
    cout<<s<<endl;
    
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}