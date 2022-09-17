#include<stdio.h>

int gcd(int n, int m)
{
	if(n == 0 || m == 0)
		return 0;
	if(n == m)
		return n;
	if(n > m)
		return gcd(n-m, m);
	if(m > n)	
		return gcd(n, m-n);
}

int main()
{
	int a, b;
	printf("Enter two integer values : ");
	scanf("%d %d", &a, &b);
	
	printf("The gcd of two numbers %d and %d = %d\n", a, b, gcd(a, b));
	return 0;
}