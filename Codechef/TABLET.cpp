#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, r, m=0;
  cin>>n>>r;
  
  while(n--){
    int a, b, c;
    cin>>a>>b>>c;
    
    if(c <= r)
      m = max(m, a*b);
  }

  if(m==0)
      cout<<"no tablet\n";
  else
       cout<<m<<endl;
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