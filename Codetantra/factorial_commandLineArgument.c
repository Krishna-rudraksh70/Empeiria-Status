#include<stdio.h>
#include<string.h>

int main(int a, char*ar[])
{
	int n, fact=1;
	
	n = atoi(ar[1]);
	
	while(n > 1)
	{
		fact *= n;
		n--;
	}
	
	printf("%d\n", fact);
	
	return 0;
}