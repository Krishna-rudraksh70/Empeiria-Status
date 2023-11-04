#include <iostream>
using namespace std;
#define int long long
int32_t main() {
	// your code goes here
	int tt;
	cin>>tt;
	while(tt--)
	{
	    int a,b,c;
	    cin>>a>>b>>c;
	    if((a>b)&&(b>c))
	    {  int p=a|b|c;
	        cout<<p<<endl;
	    }
	    else if((a<b)&&(b<c))
	    {
	        cout<<0<<endl;
	    }
	    else
	    {
	        cout<<-1<<endl;
	    }
	}
	return 0;
}