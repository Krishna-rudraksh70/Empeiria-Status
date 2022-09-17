#include<stdio.h>
#include<math.h>
main()
{
	float p,a,b,c,Area;
	printf("enter sides : ");
	scanf("%f%f%f",&a,&b,&c);
	p=(a+b+c)/2;
	Area=sqrt(p*(p-a)*(p-b)*(p-c));
	printf("area : %f\n", Area);
}