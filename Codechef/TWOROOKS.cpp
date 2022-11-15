#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int x1,x2,y1,y2;
  cin>>x1>>y1>>x2>>y2;
  
  cout<<((x1==x2 || y1==y2)? "YES":"NO")<<endl;
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