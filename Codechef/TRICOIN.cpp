#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int n;
	cin>>n;
	
	while(n--)
	{
	    int k, h=0;
	    cin>>k;
	    
	    for(int i=1; i<=k; i++)
	    {
	        k -= i;
	        h++;
	    }
	    
	    cout<<h<<endl;
	}
	
	return 0;
}
