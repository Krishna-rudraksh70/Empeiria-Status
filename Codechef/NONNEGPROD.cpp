#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int n, m, neg=0, z=0;
    cin>>n;
  
    for(int i=0; i<n; i++){
         cin>>m;
        if(m==0)
         z++;
        else if(m < 0)
         neg++;
  }
  
  if(z > 0 || neg%2==0)
    n = 0;
  else
    n = 1;
    
  cout<<n<<endl;
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