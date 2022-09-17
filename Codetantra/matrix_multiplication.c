#include<stdio.h>

int main()
{
	int r1, c1, r2, c2, i, j, k;
	printf("Enter the number of rows and columns of first matrix: ");
	scanf("%d %d", &r1, &c1);
	int arr1[r1][c1];
	
	printf("Enter the elements of first matrix: ");
	for(i=0; i<r1; i++)
	{
		for(j=0; j<c1; j++)
		{
			scanf("%d", &arr1[i][j]);
		}
	}
	
	printf("Enter the number of rows and columns of second matrix: ");
	scanf("%d %d", &r2, &c2);
	int arr2[r2][c2];
	
	printf("Enter the elements of second matrix: ");
	for(i=0; i<r2; i++)
	{
		for(j=0; j<c2; j++)
		{
			scanf("%d", &arr2[i][j]);
		}
	}
	
	int arr_mul[r1][c2];
	
	for(i=0; i<r1; i++)
	{
		for(j=0; j<r2; j++)
		{
			arr_mul[i][j] = 0;
			
			for(k=0; k<c2; k++)
			{
				arr_mul[i][j] += (arr1[i][k] * arr2[k][j]);
			}
		}
	}
	
	printf("Product of entered matrices:\n");
	
	for(i=0; i<r1; i++)
	{
		for(j=0; j<c2; j++)
		{
			printf("%d\t", arr_mul[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}