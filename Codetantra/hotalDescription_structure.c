#include<stdio.h>

struct hotal_details {
	
	char h_nm[10];
	char c_nm[10];
	int g[10];
	int r_c[10];
	int n_r[10];
}h[5];

void main()
{
	int n, i, m;
	
	printf("Enter no. of hotels: ");
	scanf("%d", &n);
	
	for(i=0; i<n; i++)
	{
		printf("Enter name of hotel: ");
		scanf("%s", h[i].h_nm);
		printf("Enter name of city: ");
		scanf("%s", h[i].c_nm);
		printf("Enter the grade: ");
		scanf("%d", h[i].g);
		printf("Enter room charge: ");
		scanf("%d", h[i].r_c);
		printf("Enter no. of rooms: ");
		scanf("%d", h[i].n_r);
	}
	
	printf("Enter a grade to print the hotels: ");
	scanf("%d", &m);
	
	printf("Hotelname\tcity\t\tgrade\t\troomcharge\tno of room: \n");
	
	for(i=0; i<n; i++)
	{
		if(m == *h[i].g)
		{
			printf("%s\t\t%s \t\t%d \t\t%d\t\t%d\n", h[i].h_nm, h[i].c_nm, *h[i].g, *h[i].r_c, *h[i].n_r);
		}
	}
	
}