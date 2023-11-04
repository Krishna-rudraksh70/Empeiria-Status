#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int n, m;
    cin>>n>>m;
  
    int max_nbr = min(n / m, 20);

    cout<<max_nbr<<endl;
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