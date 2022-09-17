#include<stdio.h>

int dec(int n)
{
	if(n == 0)
	return 0;
	
	return (n%10 + (2 * dec(n/10)));
}

main()
{
	int n;
	printf("Enter any binary number : ");
	scanf("%d", &n);
	
	printf("Decimal value : %d\n", dec(n));
}