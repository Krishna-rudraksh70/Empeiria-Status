#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int R1, R2, R3;
    cin >> R1 >> R2 >> R3;

    if (R1 > (R2 + R3) || R2 > (R1 + R3) || R3 > (R1 + R2))
            cout << "YES" << endl;
    else
            cout << "NO" << endl;
}

int main(){

    ios_base::sync_with_stdio (false);
    cin.tie(NULL);cout.tie(NULL);

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}