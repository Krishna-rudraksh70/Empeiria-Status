#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define fr2(i, a, b) for(int i=0; i<n; i += 2)

void x(int n, int m){
    
}

void sol(){
  
  int n;
  cin>>n;

  char c[2][2] = {'A', 'T', 'C', 'G'};

  string s;
  cin>>s;

  fr2(i, 0, n-1){
    cout<<c[s[i]-'0'][s[i+1]-'0'];
  }
  cout<<endl;
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