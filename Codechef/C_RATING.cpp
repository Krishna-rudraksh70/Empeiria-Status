#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int n;
	cin>>n;
	
	while(n--)
	{
	    int x, y;
	    cin>>x>>y;
	    
	    int i=0;
	    
	    while(x<y)
	    {
	        x += 8;
	        i++;
	    }
	    
	    cout<<i<<endl;
	}
	
	return 0;
}
