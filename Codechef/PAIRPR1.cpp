#include <bits/stdc++.h>
#define lli long long int
using namespace std;
bool isPrime(lli n){
    for (lli i = 2; i * i <= n; i++)
        if (n % i == 0)
            return false;

    return true;
}

void sol(){

    lli n;
    cin >> n;
    if (n <= 3){
        cout << -1 << " " << -1 << endl;
        return;
    }
    for (int i = 2; i <= n / 2; i++){
        if (isPrime(i) && isPrime(n - i)){
            cout << i << " " << n - i << endl;
            return;
        }
    }
    cout << -1 << " " << -1 << endl;
}
int main(){
    lli t;
    cin >> t;
    while (t--){
        sol();
    }
    return 0;
}