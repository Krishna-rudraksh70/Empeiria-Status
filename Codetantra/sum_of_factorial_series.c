#include<stdio.h>
#include<math.h>
int main()
{
	long int r, k=1, p, f=1, s=0;
	printf("Enter the last number of the series: ");
	scanf("%ld", &r);
	p=r;
	
	while(r != 0)
	{
		for(int i=1; i <= r; ++i)
		{
			f *= i;
		}
	   s += f;
	 printf("%ld!", k);
		if(k == p){
			printf(" = ");	}
		else {	printf(" + ");	}
	   --r;
	   f = 1;
	   ++k;
	}
	
	printf("%ld", s);
	
	return 0;
}