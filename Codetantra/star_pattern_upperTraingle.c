#include<stdio.h>
int main()
{
	int n, i=1;
	printf("Enter the number of rows: ");
	scanf("%d", &n);
	
    while (i <= n)
    {
    	for (int j=0; j<i; j++)
    	{
    		printf("* ");
    	}
    	printf("\n");
    	i++;
    }
	
	return 0;
}