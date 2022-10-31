#include<stdio.h>
#include<string.h>
int main()
{
    int t,len=0;
    int lens[2];
    char input[100001];
    scanf("%d",&t);
    while(t--)
    {
        scanf("%s",input);
        len = strlen(input);
        lens[0] = 0;
        lens[1] = 0;
        for(int i=0;i<len;i++)
        {
            lens[input[i]-'0']++;
        }
        if(lens[0]==1 || lens[1]==1)
            printf("Yes\n");
        else
            printf("No\n");
    }
    return 0;
}