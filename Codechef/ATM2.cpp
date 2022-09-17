#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int n;
	cin>>n;
	
	while(n--)
	{
	    int t, amt;
	    cin>>t>>amt;
	    
	    while(t--)
	    {
	        int w;
	        cin>>w;
	  
	        if(w <= amt)
	        {
	            cout<<1;
	            amt -= w;
	        }
	        else
	            cout<<0;
	    }
	    cout<<endl;
	}
	return 0;
}
