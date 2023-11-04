#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

#define ll long long
#define FOR(i, start, end, j) for(int i = start; i <= end; i += j)
#define RFOR(i, start, end, j) for(int i = start; i >= end; i -= j)

typedef vector<int> v;
typedef pair<int, int> pr;

template<typename T>
T gcd(T a, T b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}

template<typename T>
T lcm(T a, T b) {
    return (a * b) / gcd(a, b);
}

bool isPrime(int n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    }
    return true;
}

void sol() {
    int N;
    cin >> N;

    int player1Score = 0, player2Score = 0;
    int maxLead = 0, winner = 0;

    for (int i = 0; i < N; i++) {
        int p1, p2;
        cin >> p1 >> p2;

        player1Score += p1;
        player2Score += p2;

        int lead = abs(player1Score - player2Score);

        if (player1Score > player2Score && lead > maxLead) {
            maxLead = lead;
            winner = 1;
        } else if (player2Score > player1Score && lead > maxLead) {
            maxLead = lead;
            winner = 2;
        }
    }

    cout << winner << " " << maxLead << endl;
}

int32_t main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    //int n;
    //cin >> n;

    //while (n--) {
        sol();
    //}

    return 0;
}
