#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define fr(i, a, b) for (int i = a; i < b; i++)

int main()
{

  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  cout.tie(NULL);

  int t;
  cin >> t;

  while (t--)
  {
    int n, k;
    cin >> n >> k;

    int arr[n];
    bool flag = false;

    fr(i, 0, n)
    {
      cin >> arr[i];

      if (arr[i] == k and i != n - 1)
        flag = true;
    }

    if (n == 1 and k == arr[0])
    {
      cout << "YES" << endl;
      continue;
    }

    cout << ((flag) ? "YES" : "NO") << endl;
  }

  return 0;
}