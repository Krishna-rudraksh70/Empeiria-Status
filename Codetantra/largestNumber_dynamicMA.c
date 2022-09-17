#include<stdio.h>
#include<stdlib.h>

int main()
{
	int n, i;
	double *num;
	
	printf("Enter the total number of elements: ");
	scanf("%d", &n);
	
	num = (double*)calloc(n, sizeof(double));
	
	for(i=0; i<n; ++i)
	{
		printf("Enter Number %d: ", i+1);
		scanf("%lf", num+i);
	}
	
	for(i=1; i<n; ++i)
	{
		if(*num < *(num + i))
		{
			*num = *(num + i);
		}
	}
	
	printf("Largest number: %.2lf\n", *num);
	
	free(num);
	
	return 0;
}