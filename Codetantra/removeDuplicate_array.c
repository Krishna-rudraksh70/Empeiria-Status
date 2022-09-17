#include<stdio.h>

int main()
{
	int n=10;
	int arr[n];
	printf("Enter the elements of the array:\n");
	
	for(int i=0; i<n; i++)
	{
		printf("arr[%d]: ", i+1);
		scanf("%d", &arr[i]);
	}
	
	for(int i=0; i<n; i++)
	{
		for(int j=i+1; j<n;)
		{
			
			if(arr[i] == arr[j])
			{
				for(int k=j; k<n; k++)
				{
					arr[k] = arr[k+1];
				}
			
				n--;
			}
		
			else
				j++;
		}
	}
	
	printf("Array without duplicate elements is: ");
	
	for(int i=0; i<n; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
	
	return 0;
}