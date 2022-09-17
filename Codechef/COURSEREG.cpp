#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int n;
	cin>>n;
	
	while(n--)
	{
	    int a,b,c;
	    cin>>a>>b>>c;
	    
	    if(a+c <= b)
	        cout<<"Yes"<<endl;
	    else
	        cout<<"No"<<endl;
	}
	return 0;
}
