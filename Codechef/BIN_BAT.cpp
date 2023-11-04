#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
	int N, A, B;
	cin >> N >> A >> B;
	int time = 0;
	while (N > 1){
		N = N / 2;
		time = time + A;
		if (N >= 2)
			time = time + B;
	}
	cout << time << endl;
}

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int T;
	cin >> T;

	while (T--)
		sol();

	return 0;
}
