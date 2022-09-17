#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int a, b, c, d, k=0;
	cin>>a>>b>>c>>d;
	
	if(a >= 10) ++k;
	if(b >= 10) ++k;
	if(c >= 10) ++k;
	if(d >= 10) ++k;
	
	cout<<k<<endl;
	return 0;
}
