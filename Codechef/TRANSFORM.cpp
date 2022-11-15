#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int dec(int n){
    if(n%3 == 0)
        return 1;
    if(n%3 == 1)
        return 2;
    return 0;
}

void sol(){
  int n;
  cin>>n;
  
  string s[] = {"SMALL", "NORMAL", "HUGE"};
  
  cout<<s[dec(n)]<<endl;
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