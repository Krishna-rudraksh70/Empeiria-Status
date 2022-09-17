#include<stdio.h>
#include<string.h>

int main()
{
	char s[20];
	int l, ind=0;
	
	printf("Enter any string: ");
	scanf("%s", s);
	
	l = strlen(s);
	
	for(int i=0; i<l / 2; i++)
	{
		if(s[i] != s[l - i - 1])
		{
			ind = 1;
			break;
		}
	}
	
	if(ind)
		printf("string is not palindrome\n");
	else
		printf("string is palindrome\n");
		
	return 0;
}