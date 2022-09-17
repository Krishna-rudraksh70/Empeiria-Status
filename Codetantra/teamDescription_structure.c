#include<stdio.h>

struct date_player {
	
	char nm[10];
	char tn[10];
	float b_a;
}p[5];

void main()
{
	printf("Enter Data Of 5 Player: \n");
	
	int i;
	
	for(i=0; i<5; i++)
	{
		printf("Enter Player Name,Team Name And Bating Average For Player %d : ", i+1);
		scanf("%s %s %f", p[i].nm, p[i].tn, &p[i].b_a);
	}
	
	printf("After Teamwise Sorting Player List Is: \n");
	
	for(i=0; i<5; i++)
	{
		printf("%-10s %-10s %.2f\n", p[i].nm, p[i].tn, p[i].b_a);
	}
	
	return 0;
}