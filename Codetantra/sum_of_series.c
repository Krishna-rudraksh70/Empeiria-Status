#include<stdio.h>
#include<math.h>
int main()
{
	long double n, x, sign, f=1, s=0, ans;
	printf("Enter the value of x : ");
	scanf("%LF", &x);
	printf("Enter the value of n : ");
	scanf("%LF", &n);
	
	while(n != 0)
	{
		for(int i=1; i <= n; ++i)
		{
			f *= i;
		}
		sign = pow((-1),n);
		s += (sign * pow(x,n)) / f;
		--n;
		f = 1;
	}
	ans = 1+s;
	printf("Sum of the given series is : %.4LF\n", ans);
	
	return 0;
}