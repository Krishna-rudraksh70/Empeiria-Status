#include<stdio.h>
#include<math.h>
int main()
{
	int n, a,p=0,b;
	printf("Enter a number: ");
	scanf("%d", &n);
	
	a = n;
	
	while(a > 0)
	{
		p++;
		a /= 10;
	}
	
	do
	{
		b = pow(10,p);
		n = n%b;
		if(n != 0)
		printf("%d\n", n);
		p--;
	}while(n > 0);
	
	return 0;
}