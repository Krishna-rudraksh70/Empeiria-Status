#include<stdio.h>
#include<math.h>
int main()
{
	int n, a, b, s=0, r, c=0;
	printf("Enter any number: ");
	scanf("%d", &n);
	a = b = n;
	
	while(b != 0)
	{ b /= 10;
		c++;  }
	while(n != 0)
	{	r = n % 10;
		s += pow(r,c);
		n = n / 10;    }
	if (a == s)
		{ printf("The given number %d is an armstrong number\n", a); }
	else
		{ printf("The given number %d is not an armstrong number\n", a); }

	return 0;
}