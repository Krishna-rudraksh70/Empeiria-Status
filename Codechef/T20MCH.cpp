#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int r , o ,c;
	
	cin>>r>>o>>c;
	
	o = 20 - o;
	o *= 36;
	
	if((c+o) > r)
	    cout<<"YES\n";
	else
	    cout<<"NO\n";
	return 0;
}
