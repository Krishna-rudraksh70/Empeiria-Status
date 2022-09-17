#include<stdio.h>

int area(int a, int b)
{
	return a*b;
}

int main()
{
	int a,b;
	printf("Enter the length of the rectangle: ");
	scanf("%d", &a);
	printf("Enter the width of the rectangle: ");
	scanf("%d", &b);
	printf("The area of the rectangle: %d", area(a,b));
	
	return 0;
}