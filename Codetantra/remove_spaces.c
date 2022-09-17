#include<stdio.h>
#include<string.h>

int main()
{
	char s[50];
	int i, j;
	
	printf("Enter the text: ");
	gets(s);
	
	for(i=0; i<strlen(s); i++)
	{
		if(s[i] == ' ')
		{
			for(j=i; j<strlen(s); j++)
			{
				s[j] = s[j+1];
			}
		}
	}
	
	printf("string after removing all blank spaces: ");
	puts(s);
	
	printf("Total number of characters in a string: %d", strlen(s));
	
	return 0;
}