#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n;
  cin>>n;
  
  cout<<"0";
  for(int i=0;i<n-2;i++){
      cout<<"1";
	}
  cout<<"0"<<endl;
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