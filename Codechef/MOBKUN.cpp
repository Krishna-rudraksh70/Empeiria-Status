#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int y1,m,k,d;
	cin>>y1>>m>>k>>d;
	        
	int elements=y1*(k-1);
	int mobdays=y1*k+m;
	int rem=d%mobdays;
	if(rem==0 || (rem-elements)>0)
	    cout<<"YES"<<endl;
	  else
	    cout<<"NO"<<endl;
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