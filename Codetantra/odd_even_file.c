#include<stdio.h>
#include<stdlib.h>

int main()
{
	FILE *kri, *sh, *na;
	char k_g[20];
	int cole;
	
	printf("Enter the filename which you want to open(numbers.txt or numbers1.txt): ");
	scanf("%s", k_g);
	
	kri = fopen(k_g, "r");
	sh = fopen("Odd.txt", "w+");
	na = fopen("Even.txt", "w+");
	
	if(kri != NULL)
		printf("File opened successfully. Reading integers from file. \n");
		
	while(!feof(kri))
	{
		fscanf(kri, "%d", &cole);
		
		if((cole%2) == 0)
			fprintf(na, "\n%d", cole);
		else
			fprintf(sh, "\n%d", cole);
	}
	
	printf("Data written to files successfully.\n");
	printf("Contents of even.txt:\n");
	
	fseek(na, 0, SEEK_SET);
	
	while(!feof(na))
	{
		fscanf(na, "%d", &cole);
		printf("%d\n", cole);
	}
	
	printf("Contents of odd.txt:\n");
	
	fseek(sh, 0, SEEK_SET);
	
	while(!feof(sh))
	{
		fscanf(sh, "%d", &cole);
		printf("%d\n", cole);
	}
	
	fclose(kri);
	fclose(sh);
	fclose(na);
	
	return 0;
	
}