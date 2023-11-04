#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
	    long long int n,k;
	    cin>>n>>k;
	    long long int sum = (n*(n-1))/2;
	    if(k<n/2){
	        long long x = n-2*k;
	        sum -= (x*(x-1))/2;
	    }
	    cout<<sum<<endl;
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