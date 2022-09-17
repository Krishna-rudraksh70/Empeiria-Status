#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int n;
	cin>>n;
	
	while(n--)
	{
	    int dc, cc, a1, a2, a3, b1, b2, b3;
	    
	    cin>>dc>>cc;
	    
	    cin>>a1>>a2>>a3;
	    cin>>b1>>b2>>b3;
	    
	    int asum = a1+a2+a3;
	    int bsum = b1+b2+b3;
	   
	   if(asum >= 150 && bsum >= 150)
	       if(dc+dc > cc)
	           cout<<"YES\n";
	       else
	           cout<<"NO\n";
	   else if(asum >= 150 || bsum >= 150)
	       if(dc+dc > dc+cc)
	           cout<<"YES\n";
	       else
	           cout<<"NO\n";
	   else
	       cout<<"NO\n";
	   
	}
	
	return 0;
}
