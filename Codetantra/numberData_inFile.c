#include<stdio.h>
#include<string.h>

int main()
{
	FILE *k, *g;
	int i, j=0, n;
	char c[20];
	
	printf("Enter the filename to open for reading(numbers.txt or numbers1.txt): ");
	scanf("%s", c);
	
	k = fopen(c, "r");
	g = fopen("square.txt", "w");
	
	printf("Contents copied to %s\n", c);
	printf("Contents of square.txt: \n");
	
	if(strcmp(c, "square.txt") == 0)
	{
		while(!feof(k));
		{
			fscanf(k, "%d", &i);
			n = i*i;
			fprintf(k, "%d\n", n);
			printf("%d\n", n);
			j++;
		}
	}
	else
	{
		while(!feof(k))
		{
			fseek(k, j--, SEEK_SET);
			fscanf(k, "%d", &i);
			n = i*i;
			fprintf(g, "%d\n", n);
			printf("%d\n", n);
		}
	}
	
	fclose(k);
	fclose(g);
	
	return 0;
}