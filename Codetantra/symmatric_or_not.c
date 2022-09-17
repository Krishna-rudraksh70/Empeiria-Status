#include<stdio.h>

int main()
{
	int i, j, arr[3][3], t_arr[3][3], chk=1;
	
	printf("Enter elements in matrix of size 3x3: ");
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			scanf("%d", &arr[i][j]);
		}
	}
	
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			t_arr[i][j] = arr[j][i];
			
			if(arr[i][j] != arr[j][i])
			{
				chk = 0;
			}
		}
	}
	
	if(chk)
	{
		printf("The given matrix is Symmetric matrix: \n");
		
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
			{
				printf("%d ", t_arr[i][j]);
			}
			printf("\n");
		}
	}
	else
	{
		printf("The given matrix is not Symmetric matrix.\n");
	}
	
	return 0;
}