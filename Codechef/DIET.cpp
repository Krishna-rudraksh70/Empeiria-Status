#include<iostream>



using namespace std; 

int t, n, a[100], k, c=0, p=0;

int main()
{
	cin >> t; 
	while (t--)
	{
		c = 0; 
		p = 0; 
		cin >> n >> k; 
		for (int i = 0; i < n; i++)
		{
			cin >> a[i]; 
		}
		for (int i = 0; i < n; i++)
		{
			c += a[i]; 
			c -= k; 
			p++; 
			if (c < 0)
			{
				cout << "NO " << p << endl; 
				break;
			}
		}
		if (c >= 0)
		{
			cout << "YES" << endl;
		}
	}
	return 0; 
}