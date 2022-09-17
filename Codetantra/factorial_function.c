#include<stdio.h>

int fact(int n)
{
	int f =1;
	
	while(n > 0)
	{
		f *= n;
		n--;
		
	}
	return f;
}

int main()
{
	int n;
	printf("Enter a number : ");
	scanf("%d", &n);
	printf("Factorial of a given number %d = %d\n", n, fact(n));
	
	return 0;
}