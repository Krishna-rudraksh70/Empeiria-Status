#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n;
  cin>>n;
  
  cout<<((n<7)?((n%2==0)?"YES":"NO"):"YES")<<endl;
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