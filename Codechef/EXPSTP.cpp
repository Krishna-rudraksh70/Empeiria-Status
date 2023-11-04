#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
	    int n,a,b,x,y;
	    cin>>n>>a>>b>>x>>y;
	    int p = min(a,n-a+1);
	    int q = min(b,n-b+1);
	    int c = min(x,n-x+1);
	    int d = min(y,n-y+1);
	    cout<<min(abs(x-a)+abs(y-b), min(c,d)+min(p,q))<<endl;
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