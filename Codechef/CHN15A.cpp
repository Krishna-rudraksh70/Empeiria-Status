#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int n, a, b, k;
	cin>>n;
	
	
	while(n--)
	{
	    k=0;
	    cin>>a>>b;
	    int arr[a];
	    
	    for(int i=0; i<a; i++)
	    {
	        cin>>arr[i];
	        arr[i] += b;
	        
	        if(arr[i]%7 == 0)
	            k++;
	    }
	    
	    cout<<k<<endl;
	    
	}
	
	return 0;
}
