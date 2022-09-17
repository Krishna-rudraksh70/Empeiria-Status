#include<stdio.h>

long double fib(int n)
{
	long double a=0, b=1, c, s=1;
	
	for(int i=2; i < n; ++i)
	{
		c = a + b;
		s += c;
		a = b;
		b = c;
	}
	
	return s;
}

int main()
{
	int n;
	printf("Enter the range: ");
	scanf("%d", &n);
	printf("Sum of Fibonacci series for given range is: %.Lf\n", fib(n));
	
	return 0;
}