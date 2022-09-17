#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	
	int n, m;
	long int a, b, lcm, gcd;
	
	cin>>n;
	
	while(n--)
	{
	    cin>>a>>b;
	    
	    gcd = __gcd(b%a, a);
	    lcm = (a*b)/gcd;
	    
	    cout<<gcd<<" "<<lcm<<endl;
	}
	
	return 0;
}
