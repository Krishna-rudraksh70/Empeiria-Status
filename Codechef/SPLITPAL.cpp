#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int left = 0, right = n - 1, k = 0;
    while (left < right)
    {
        if (a[left] == a[right])
        {
            left++, right--;
        }
        else if (a[left] > a[right])
        {
            a[left] = a[left] - a[right];
            right--;
            k++;
        }
        else
        {
            a[right] = a[right] - a[left];
            left++;
            k++;
        }
    }
    cout << k << endl;
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