#include<stdio.h>

int fact(int n)
{
	int f=1, s=0;
	
	for(int i=1; i<=n; i++)
	{
		f *= i;
		s += f;
		
		if(n > i)
		{
			printf("%d! + ", i);
		}
		else {
				printf("%d! = %d", i, s);
		}
	}
	return 0;
}

int main()
{
	int n;
	printf("Enter the last number of series: ");
	scanf("%d", &n);
	
	fact(n);
	
	return 0;
}