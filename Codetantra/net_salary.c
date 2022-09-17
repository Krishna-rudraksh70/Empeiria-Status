#include <stdio.h>

main()
{
	float basic_sal,da,hra,pf,gross_sal,net_sal;
	printf("Enter Basic Salary : ");
	scanf("%f", &basic_sal);
	da=(basic_sal*25)/100;
	hra=(basic_sal*15)/100;
	gross_sal = basic_sal+da+hra;
	pf=(gross_sal*10)/100;
	net_sal = gross_sal-pf;
	printf("Net Salary is : $%.2f\n", net_sal);
}