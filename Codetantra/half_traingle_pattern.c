#include<stdio.h>
int main(){
	
	int n;
	printf("Enter number of rows : ");
	scanf("%d", &n);
	
	while(n != 0)
	{
		for(int i=n; i>=1; --i)
		{
			printf("%d ", i);
		}
		
		printf("\n");
		n--;
	}
	
	return 0;
}