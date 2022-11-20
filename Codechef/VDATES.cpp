#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, m, z;
  cin>>n>>m>>z;
  
  cout<<((n>=m and n<= z)?"Take second dose now":(n>z)? "Too Late":"Too Early")<<endl;
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