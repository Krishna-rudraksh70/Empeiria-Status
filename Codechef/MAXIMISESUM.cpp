#include <iostream>
#include <bits/stdc++.h>
typedef long long ll;
using namespace std;

void sol()
{

    ll n;
    cin >> n;
    vector<ll> arr(n);
    vector<pair<ll, ll>> vp;
    for (ll i = 0; i < n; i++){
        cin >> arr[i];
        vp.push_back({arr[i], i});
    }
    sort(vp.rbegin(), vp.rend());

    ll mx = arr[0];

    for (ll i = 0; i < vp[0].second; i++){
        mx = max(mx, arr[i]);
        arr[i] = mx;
    }

    mx = arr[n - 1];
    for (ll i = n - 1; i > vp[0].second; i--){
        mx = max(mx, arr[i]);
        arr[i] = mx;
    }

    ll sum = 0;
    for (ll i = 0; i < n; i++){
        sum += arr[i];
    }

    cout << sum << endl;
}

int main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t;
    cin >> t;

    while (t--)
        sol();

    return 0;
}