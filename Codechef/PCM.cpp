#include <bits/stdc++.h>
#include <string>
using namespace std;

void sol()
{

    string sub;
    cin >> sub;

    sort(sub.begin(), sub.end());

    if (sub[0]=='C' && sub[1]=='M' && sub[2]=='P')
        cout << "YES\n";
    else
        cout << "NO\n";
}

int main()
{
    // your code goes here

    int t;
    cin >> t;

    while (t-- > 0)
        sol();
        
    return 0;
}