#include<stdio.h>

int bin(int n)
{
	if(n == 0)
	return 0;
	
	return (n%2 + (10 * bin(n/2)));
}

int main()
{
	int k;
	printf("Enter a positive decimal number : ");
	scanf("%d", &k);
	
	printf("The binary number of decimal %d is : %d\n", k, bin(k));

	return 0;
	
}