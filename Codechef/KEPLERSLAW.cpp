#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    double n, m, i, j;
    cin>>n>>m>>i>>j;
    
    
    n = pow(n, 2);
    m = pow(m, 2);
    i = pow(i, 3);
    j = pow(j, 3);
    
    string s;
  
    if((n/i)==(m/j))
        s = "Yes";
    else
        s = "No";
        
    cout<<s<<endl;
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