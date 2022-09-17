#include <stdio.h>
void main()
{
    int n, m, i, j, flag;
    printf("Enter the number of elements of A: ");
    scanf("%d", &n);
    printf("Enter the number of elements of B: ");
    scanf("%d", &m);
    int a[n], b[m];
    printf("Enter the elements of A: ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("Enter the elements of B: ");
    for (j = 0; j < m; j++)
    {
        scanf("%d", &b[j]);
    }
    printf("The complement is :");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < m; j++)
        {
            if (a[i] == b[j])
            {
                flag = 1;
            }
        }
        if (flag == 0)
        {
            printf(" %d", a[i]);
        }
        flag = 0;
    }
    printf("\n");
}