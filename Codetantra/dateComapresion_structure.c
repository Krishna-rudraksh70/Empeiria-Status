#include<stdio.h>

struct date 
{
	int day;
	int mon;
	int yr;
}d1,d2;

void main()
{
	printf("Enter first date(dd mm yyyy): ");
	scanf("%d %d %d", &d1.day, &d1.mon, &d1.yr);
	
	printf("Enter second date(dd mm yyyy): ");
	scanf("%d %d %d", &d2.day, &d2.mon, &d2.yr);
	
	if((d1.day == d2.day) && (d1.mon == d2.mon) && (d1.yr == d2.yr))
		printf("EQUAL\n");
	else
		printf("UNEQUAL\n");
}