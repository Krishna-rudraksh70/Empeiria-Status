#include <stdio.h>
void main()
{
    int n, m, i = 0, j = 0, flag = 0;
    printf("Enter the total elements in set A : ");
    scanf("%d", &m);
    int a[m];
    printf("Enter elements of set A : ");
    for (i = 0; i < m; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("Enter the total elements in set B : ");
    scanf("%d", &n);
    int b[n];
    printf("Enter elements of set B : ");
    for (j = 0; j < n; j++)
    {
        scanf("%d", &b[j]);
    }
    printf("A-B set is :");
    for (i = 0; i < m; i++)
    {
        for (j = 0; j < n; j++)
        {
            if (a[i] == b[j])
                flag = 1;
        }
        if (flag == 0)
            printf(" %d", a[i]);
        flag = 0;
    }
    printf("\n");
}