#include <stdio.h>
main()
{
	float a, b, c;
	printf("Enter three different numbers speterated by spaces : ");
	scanf("%f %f %f", &a, &b, &c);
	if (a > b && a > c)
	{
		printf("%.2f is the largest number", a);
	}
	else if (b > c)
	{
		printf("%.2f is the largest number", b);
	}
	else {
		printf("%.2f is the largest number", c); 
		
	     }
}