#include<stdio.h>
int main()
{
	long double  a=0, b=1, s=1, c, r;
	printf("Enter the range: ");
	scanf("%LF", &r);
	for(int i = 2; i < r; ++i)
	{
		c = a + b;
		s += c;
		a = b;
		b = c;
	}
	printf("Sum of Fibonacci series for given range is: %0.LF\n", s);
	return 0;
}