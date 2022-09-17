#include <bits/stdc++.h>
using namespace std;

int main() {
	int n;
    cin>>n;
    while(n--)
    {
        int c, p;
        cin>>c>>p;
        int mx = INT_MIN;
        for(int i = 1; i <= p; i++)
        {
            mx = max(mx, c%i);
        }
        cout<<mx<<endl;
    }
	return 0;
}

