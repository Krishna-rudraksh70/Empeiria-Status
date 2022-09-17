#include<stdio.h>

int main()
{
	int r, c, i, j, sum=0;
	
	printf("Enter the number of rows and columns for 1st matrix: ");
	scanf("%d %d", &r, &c);
	int arr[r][c];
	
	printf("Enter the elements of the matrix: ");
	for(i=0; i<r; i++)
	{
		for(j=0; j<c; j++)
		{
			scanf("%d", &arr[i][j]);
		}
	}
	
	printf("The matrix\n");
	for(i=0; i<r; i++)
	{
		for(j=0; j<c; j++)
		{
			printf(" %d", arr[i][j]);
			
			if(i == j)
			{
				sum += arr[i][j];
			}
		}
		printf("\n");
	}
	
	printf("The sum of diagonal elements of a square matrix = %d\n", sum);
	
	return 0;
}