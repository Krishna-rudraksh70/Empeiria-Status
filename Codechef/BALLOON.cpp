#include<iostream>
#include<bits/stdc++.h>

#define ll long long
using namespace std;

void sol(){
	    ll li;
		
	    cin>>li;
		
	    ll a[li],count=0;
		
	    for(ll i=0;i<li;i++){
			
	        
			  cin>>a[i];
			
	        if(a[i]<=7) count=i;
	    }
	    cout<<count+1<<"\n";

}

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}