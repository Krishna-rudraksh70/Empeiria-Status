#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define fr(i, a, b) for(int i = a; i< b; i++)

void sol(){

	    long long x, y; cin>>x>>y;
	        
	    if(x == y)
	    {
	        cout<<x<<'\n';
	    }
	    else if(min(x, y) == 0)
	    {
	        cout<<-1<<'\n';
	    }
	    else
	    {
	        long long mi = min(x, y), mx = max(x,y);
	        long long ans = 0;
	        while(mi < mx)
	        {
	            mi *= 2;
	            ans++;
	        }
	        ans += mx;
	        cout<<ans<<'\n';
	    }
	
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}