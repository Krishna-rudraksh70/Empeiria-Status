#include<stdio.h>
#include<string.h>

int main()
{
	char kr[20], g[20];
	int i, j=0, k=0;
	FILE *kp, *gp;
	
	printf("Enter the filename to open for reading(a.txt or a1.txt): \n");
	gets(kr);
	
	printf("Enter the filename to open for writing(b.txt or b1.txt): \n");
	gets(g);
	
	kp = fopen(kr, "r");
	gp = fopen(g, "w");
	
	if(strcmp(kr, "a.txt") == 0)
	{
		k = 9;
	}
	
	fseek(kp, k, SEEK_SET);
	
	while((i = fgetc(kp)) != EOF)
	{
		j++;
		fputc(i, gp);
		printf("%c", i);
	}
	
	printf("\nContent copied to %s", g);
	printf("\nThe number of characters in the  file %s are : %d\n", g, j);
	
	fclose(kp);
	fclose(gp);
	
	return 0;
}