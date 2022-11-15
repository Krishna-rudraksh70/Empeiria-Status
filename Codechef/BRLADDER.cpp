#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol(){
    int a,b;
	cin>>a>>b;
	if(abs(a-b)==2)cout<<"YES\n";
	else if(a%2==0 && b==a+1 || b%2==0 && a==b+1)cout<<"NO\n";
	else if(abs(a-b)>2)cout<<"NO\n";
	else cout<<"YES\n";
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}