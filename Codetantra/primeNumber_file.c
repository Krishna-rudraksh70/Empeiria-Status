#include<stdio.h>
#include<stdlib.h>

int main()
{
	FILE *prm;
	int n, m, i, j;
	
	prm = fopen("prime.txt", "w");
	
	printf("Enter range : ");
	scanf("%d %d", &n, &m);
	
	printf("Prime numbers in primes.txt file:\n");
	
	for(i=n; i<=m; i++)
	{
		int k=0;
		
		if(i == 0 || i == 1)
			continue;
		else
		{
			for(j=2; j<=i/2; j++)
			{
				if(i%j == 0)
				{
					k++;
				}
			}
			
			if(k == 0)
			{
				putw(i,prm);
				printf("%d ", i);
			}
		}
	}
	
	printf("\n");
	
	fclose(prm);
	
	return 0;
}