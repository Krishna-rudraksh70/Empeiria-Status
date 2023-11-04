#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int n;
    cin>>n;
    
    if(n %2 ==0 || n ==1)
        cout<<"YES"<<endl;
    else    
        cout<<"NO"<<endl;
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