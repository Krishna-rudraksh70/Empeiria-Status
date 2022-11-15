#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int a, b, c;
  cin>>a>>b>>c;
  
  cout<<(((a+b)%2 !=0 || (b+c)%2!=0 || (a+c)%2 != 0)? "YES\n":"NO\n");
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