#include<stdio.h>

void print_line(int arr[], int n)
{
	for(int i=0; i<n; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
}

void main() {
	int rows,cols,i,j;
	int size = 0;
	int sparse_matrix[10][10];
	printf("Enter the row & column sizes of the sparse matrix : ");
	scanf("%d %d", &rows, &cols);
	for (i = 0; i < rows; i++) {
		for (j = 0; j < cols; j++) {
			printf("Enter the value of sparse_matrix[%d][%d] : ",i,j);
			scanf("%d", &sparse_matrix[i][j]);
		}
	}
	// Generate the array representation of sparse_matrix and print it.
	
	printf("Sparse matrix array representation\n");
	int row[5], col[5], value[5], k=0;
	
	for(i=0; i<rows; i++)
	{
		for(j=0; j<cols; j++)
		{
			if(sparse_matrix[i][j] != 0)
			{
				row[k] = i;
				col[k] = j;
				value[k] = sparse_matrix[i][j];
				k++;
			}
		}
	}
	
	print_line(row, k);
	print_line(col, k);
	print_line(value, k);
	
}