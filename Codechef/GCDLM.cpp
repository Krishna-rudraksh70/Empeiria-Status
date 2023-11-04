#include <iostream>
#include <algorithm>
using namespace std;

int gcd(int a, int b) {
    if (b == 0)
        return a;
    return gcd(b, a % b);
}

void sol() {
    int x, y, k;
    cin >> x >> y >> k;
    if (x == y)
        cout << x + y << endl;
    else {
        while (x != y && k > 0) {
            int a = x;
            x = max(x, y);
            y = min(a, y);
            x = gcd(x, y);
            y = y * x / x;
            k--;
        }
        cout << x + y << endl;
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t;
    cin >> t;

    while (t--)
        sol();

    return 0;
}
