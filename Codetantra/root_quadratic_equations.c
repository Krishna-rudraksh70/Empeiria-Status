#include <stdio.h>
#include <math.h>
int main()
{
	float a, b, c, d, r1, r2, real, img;
	printf("Enter coefficients a, b and c : ");
	scanf("%f %f %f", &a, &b, &c);
	d = (b * b) - (4 * a* c);
	if (d > 0)
	{
		r1 = (-b + sqrt(d)) / (2 * a);
		r2 = (-b - sqrt(d)) / (2 * a);
		printf("The roots are real and distinct\n");
		printf("root1 = %f and root2 = %f\n", r1, r2);
	}
	else if (d == 0)
	{
		r1 = r2 = -b / (2 * a);
		printf("The roots are real and equal\n");
		printf("root1 = root2 = %f\n", r1, r2);
	}
	else 
	{
		real = -b / (2 * a);
		img = sqrt(fabs(d)) / (2 * a);
		printf("The roots are real and imaginary\n");
		printf("root1 = %f+i%f\n", real, img);
		printf("root2 = %f-i%f\n", real, img);
	}
}