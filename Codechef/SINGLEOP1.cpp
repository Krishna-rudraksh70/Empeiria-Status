#include<iostream>
#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
#define fr(i, a, b) for(ll i=a; i<b; i++)

void sol(){
    int n, k=0;
    string s;
    cin>>n>>s;
    
    fr(i, 0, n){
        if(s[i]=='1')
            k++;
        else
            break;
    }
    
    cout<<k<<endl;
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}