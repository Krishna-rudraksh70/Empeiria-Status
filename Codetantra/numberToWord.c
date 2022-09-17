#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

int main()
{
	int num, rev=0, n=0;
	printf("Enter any number to print in words: ");
	scanf("%d", &num);
	
	char* word[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	
	while(num>0)
	{
		n = n*10 + (num%10);
		num /= 10;
	}
	
	while(n>0)
	{
		rev = n%10;
		
		printf("%s ", word[rev]);
		
		n /= 10;
	}
	
	return 0;
}