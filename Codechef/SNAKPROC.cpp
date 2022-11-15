#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  int n, f=1;
  cin>>n;
  
  string s;
  cin>>s;
  
	    int r=0;
	 
	    for(int i=0;i<n;i++)
	    {
	        if(s[i]=='H') r++;
	        if(s[i]=='T') r--;
	        if(r<0 || r>1){break;}
	    }
	    if(r==0)
	    cout<<"Valid"<<endl;
	    else cout<<"Invalid"<<endl;
	    
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