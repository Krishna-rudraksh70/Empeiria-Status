#include<stdio.h>
int main()
{
	int i,j,k,n1,n2;
	printf("Enter size of array Array 1: ");
	scanf("%d", &n1);
	int a[n1];
	
	printf("Enter sorted elements of array 1: ");
	for(i=0; i<n1; i++)
	{
		scanf("%d", &a[i]);
	}
	
	printf("Enter size of array 2: ");
	scanf("%d", &n2);
	int b[n2];
	
	printf("Enter sorted elements of array 2: ");
	for(i=0; i<n2; i++)
	{
		scanf("%d", &b[i]);
	}
	
	int c[n1+n2];
	i=j=k=0;
	
	while(i < n1 && j < n2)
	{
		if(a[i] < b[j])
		{
			c[k] = a[i];
			i++;
		}
		else
		{
			c[k] = b[j];
			j++;
		}
		k++;
		
	}
	
	while(i < n1)
	{
		c[k] = a[i];
		k++;
		i++;
	}
	while(j < n2)
	{
		c[k] = b[j];
		j++;
		k++;
	}
	
	printf("After merging:");
	for(i=0; i<k; i++)
	{
		printf(" %d", c[i]);
	}
	printf("\n");
	
	return 0;
}