#include <stdio.h>
void main ()
{
	int p,c,m,t,tc;
	printf("Eligibility Criteria :\n");
	printf("Marks in Physics >=40\n");
	printf("and Marks in Chemistry>=50\n");
	printf("Marks in Maths >=60\n");
	printf("and Total in all three subject >=200\n");
	printf("or Total in Maths and Physics >=150\n");
	printf("Input the marks obtained in Physics :");
	scanf("%d", &p);
	printf("Input the marks obtained in Chemistry :");
	scanf("%d", &c);
	printf("Input the marks obtained in Mathematics :");
	scanf("%d", &m);
	t=p+c+m;
	printf("Total marks of Maths, Physics and Chemistry : %d", t);
	tc=m+p;
	printf("\nTotal marks of Maths and  Physics : %d", tc);
	if ((p >= 40) && (c >= 50) && (m >= 60) && (t >= 200 || tc >= 150))
	{
		printf("\nThe  candidate is eligible for admission.\n");
	}
	else { printf("\nThe candidate is not eligible.\n"); }
}