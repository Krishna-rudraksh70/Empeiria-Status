#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    string s;
    cin>>s;
    
    int n=0;
    
    for(int i=0; i<s.size(); i++){
        n = ((s[i]-'0')==4)? n +1: n;
    }
    
    cout<<n<<endl;
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