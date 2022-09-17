#include<stdio.h>
int main()
{
	int a, x, b, n, y;
	printf("Enter the value of a , x and b:");
	scanf("%d %d %d", &a, &x, &b);
	printf("Enter the value of n to calculate y:");
	scanf("%d", &n);
	if(n == 1){
		y = (a * x) % b; }
	else if(n == 2){
		y = (a * x * x) + (b * b);  }
	else if(n == 3){
		y = a - b * x;	}
	else if(n == 4){
		 y = a + (x / b);  }
	else {
		
	}
	printf("The value of y is=%d", y);
	return 0;
}