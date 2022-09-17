#include<stdio.h>
#include<math.h>
int main(){
	
	int n1, n2, a, b, x;
	printf("Enter the values of n1 and n2 separated by space : ");
	scanf("%d%d", &n1, &n2);
	printf("Armstrong numbers between %d and %d are : ",  n1, n2);
	for(int i=n1; i<=n2; ++i)
	{
		a=b=i;
		int s=0, p=0;
		
		while(a != 0)
		{
			p++;
			a /= 10;
		}
		
		while(b != 0)
		{
			x = b%10;
			s += pow(x,p);
			b /= 10;
		}
		
		if(i == s)
			printf("%d ", i);
	
	}
	printf("\n");
	return 0;
}