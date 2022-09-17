#include<stdio.h>

int fact(int n)
{
	if (n > 0)
	return n*fact(n-1);
	else 
	return 1;
}

int main()
{
	int n;
	printf("Enter an integer : ");
	scanf("%d", &n);
	
	printf("Factorial of %d is : %d\n", n, fact(n));
	
	return 0;
}