#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int t;
    cin >> t;
    string s;
    cin >> s;
    int c = 1;
    for (int i = 0; i < t; i++)
    {
        if (s[i] == s[i + 1])
        {
            c++;
        }
        else
        {
            if (c % 2 == 0)
            {
                cout << string(2, s[i]);
            }
            else
            {
                cout << s[i];
            }
            c = 1;
        }
    }
    cout << endl;
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