#include<stdio.h>
#include<stdlib.h>

void swap(int**a, int r, int c)
{
	int i, j, temp;
	
	for(i=0; i<r; i++)
	{
		for(j=i+1; j<c; j++)
		{
			temp = a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
		}
	}
}

int main()
{
	int row, col, i, j, **a;
	
	printf("Transpose of a Matrix\n");
	printf("Enter number of rows: ");
	scanf("%d", &row);
	printf("Enter number of columns: ");
	scanf("%d", &col);
	
	a = (int*)calloc(row, sizeof(int));
	for(i=0; i<row; i++)
	{
		a[i] = (int*)malloc(col*sizeof(int));
	}
	
	printf("Enter Matrix: \n");
	
	for(i=0; i<row; i++)
	{
		for(j=0; j<col; j++)
		{
			printf("Enter Element %d %d : ", i, j);
			scanf("%d", &a[i][j]);
		}
	}
	
	printf("Entered matrix: \n");
	
	for(i=0; i<row; i++)
	{
		for(j=0; j<col; j++)
		{
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}
	
	swap(a,row,col);
	
	printf("Transpose of the given Matrix: \n");
	
	for(i=0; i<col; i++)
	{
		for(j=0; j<row; j++)
		{
			printf("%d ", a[i][j]);
		}
		printf("\n");
	}
	
	
	return 0;
}