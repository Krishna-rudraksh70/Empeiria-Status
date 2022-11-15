#include <bits/stdc++.h>
using namespace std;

#define ll long long int

void solve() {
    int n;cin >> n;
    int a[n];
    for(int i=0;i<n;i++) {
        cin>>a[i];
    }
    if(n<=2)
        cout << "YES\n";
    else if (a[0] == a[n-1] || a[0] == a[n-2] || a[1] == a[n-1])
        cout << "YES\n";
    else {
        bool g = true;
        int tmp = a[0];
        for(int i=1;i<=n-3;i++) {
            if(a[i] == tmp) {
                if(a[i+1] == a[n-1]) {
                    cout << "YES\n";
                    g = false;
                    break;
                }
            }
        }
        if (g) cout << "NO\n";
    }
}

int main() {
	int t;
	cin >> t;
	while(t--)
	    solve();
	return 0;
}