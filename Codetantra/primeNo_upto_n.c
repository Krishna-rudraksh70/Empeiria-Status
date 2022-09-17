#include<stdio.h>
int main()
{
	int n, k;
	printf("Enter maximum limit: ");
	scanf("%d", &n);
	
	for (int i=1;i <= n; ++i)
	{
		k=0;
			for (int j=2;j <= sqrt(i);++j)
			{
				if(i%j == 0)
				{
					k = 1;
					break;
				}
			}
				
				if (k==0 && i!=1)
				    printf("%d\t", i);
	}
	
	return 0;
}