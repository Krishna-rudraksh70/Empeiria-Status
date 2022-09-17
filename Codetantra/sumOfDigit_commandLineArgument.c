#include<stdio.h>
#include<string.h>

int main(int a, char*ar[])
{
	int n, temp, sum=0;
	
	temp = n = atoi(ar[1]);
	
	while(n>0)
	{
		sum += (n%10);
		n /= 10;
	}
	
	printf("Sum of the digits of %d = %d\n", temp, sum);
	
	return 0;
}