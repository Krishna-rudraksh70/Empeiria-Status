#include<stdio.h>
#include<string.h>

int main()
{
	char str[20], *i, *j, k, n, g;
	printf("Enter a string: ");
	gets(str);
	
	n = strlen(str);
	
	i = str;
	j = str;
	
	for(g=0; g<n-1; g++)
		j++;
		
	for(g=0; g<n/2; g++)
	{
		k = *i;
		*i = *j;
		*j = k;
		i++;
		j--;
	}
	
	printf("Reverse of the string is: %s ", str);
	
	return 0;
}