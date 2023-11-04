#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n;
  cin>>n;
  
  	    int a[n];
	    int count=0;
	    for(int i=0; i<n; i++){
	        cin>>a[i];
	        if(a[i]%2)
	        count++;
	    }
  
  cout<<((count==0 || count%2)?"NO":"YES")<<endl;
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