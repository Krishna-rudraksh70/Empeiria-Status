#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int a, b;
  cin>>a>>b;
  
  cout<<(((50/100.00)*a<=b)?"YES":"NO")<<endl;
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