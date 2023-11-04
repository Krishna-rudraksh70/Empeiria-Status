#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int n,m, c=0;
    cin>>n>>m;
    
    for(int i=n; i<=m; i++){
      if(i%10 == 2)
        c++;
      else if(i%10 == 3){
        c++;
        i += 5;
      }
      else if(i%10 == 9){
        c++;
        i += 2;
      }
    }
  
    cout<<c<<endl;
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