#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

	int n,p1=0,p2=0,lead1=0,lead2=0;
    int t;
    cin >> t;

    while (t--){
	    int a,b;
	    cin>>a>>b;

	    p1+=a;
	    p2+=b;
	    
	    if(p1>p2)
	    lead1 = lead1 > abs(p1-p2) ? lead1 : abs(p1-p2);
	    else
	    lead2 = lead2 > abs(p1-p2) ? lead2 : abs(p1-p2);
	}
	if(lead1 > lead2)
	cout<<1<<" "<<lead1<<endl;
	else
	cout<<2<<" "<<lead2<<endl;

    

    return 0;
}