#include <stdio.h>
void main()
{
    int n, m, i = 0, j = 0;
    printf("Enter the total elements in set A : ");
    scanf("%d", &n);
    int a[n];
    printf("Enter elements of set A : ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("Enter the total elements in set B : ");
    scanf("%d", &m);
    int b[m];
    printf("Enter elements of set B : ");
    for (j = 0; j < m; j++)
    {
        scanf("%d", &b[j]);
    }
    printf("Common elements :");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            if (a[i] == b[j])
            {
                printf("%d ", a[i]);
            }
        }
    }
}