#include<stdio.h>
#include<string.h>

int main()
{
	char k_r, str[20];
	printf("Enter some text: ");
	scanf("%s", str);
	
	for(int i=0; i<strlen(str)-1; i++)
	{
		for(int j=i+1; j<strlen(str); j++)
		{
			if(str[i] > str[j])
			{
				k_r = str[i];
				str[i] = str[j];
				str[j] = k_r;
			}
		}
	}
	
	puts(str);
	
	return 0;
}