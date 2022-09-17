#include<stdio.h>

int sum(int n)
{
	if(n >  0)
	return (n%10+sum(n/10));
	else
	return 0;
}

main()
{
	int n;
	printf("Enter any number to find sum of digits: ");
	scanf("%d", &n);
	
	printf("Sum of digits of %d = %d", n, sum(n));
	
	return 0;
}