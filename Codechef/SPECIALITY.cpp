#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int k, r, i;
  cin>>k>>r>>i;
  
  i = max(k,max(r,i));
  
  cout<<((i==k)?"Setter":
         (i!=r)?"Editorialist":"Tester")<<endl;
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