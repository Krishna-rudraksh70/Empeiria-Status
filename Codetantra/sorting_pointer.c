#include<stdio.h>

int main()
{
	int k[10], n, m, i, j;
	
	printf("How many numbers: ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("Enter number %d: ", i+1);
		scanf("%d", &(*(k+i)));
	}
	
	for(i=0; i<n; i++)
	{
		for(j=i+1; j<n; j++)
		{
			if(k[i] > k[j])
			{
				m = *(k+i);
				*(k+i) = *(k+j);
				*(k+j) = m;
			}
		}
	}
	
	printf("The sorted numbers are:");
	
	for(j=0; j<n; j++)
		printf("%d ", *(k+j));
	
	return 0;
}