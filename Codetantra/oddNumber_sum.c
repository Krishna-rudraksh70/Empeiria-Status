#include<stdio.h>
int main()
{
	int n, x, s=0;
	printf("Enter any positive number: ");
	scanf("%d", &n);
	printf("All odd digits sum is: ");
	
	
	while(n > 0)
	{
		x = n%10;
		
		if (x%2 != 0)
		{
			s += x;
		}
		
		n /= 10;
	}
	
	printf("%d", s);
	return 0;
}