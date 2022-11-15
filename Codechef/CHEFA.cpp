#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin >> t;
	while(t--){
	    int n;
	    cin>> n;
	    int a[n];
	    for(int i=0;i<n;i++)
	        cin >> a[i];
	    sort(a,a+n);
	    long long int ans=0;
	    for(int i=n-1;i>=0;i-=2) {
	        ans+=a[i];
	    }
	    cout <<  ans << '\n';
	}
	return 0;
}