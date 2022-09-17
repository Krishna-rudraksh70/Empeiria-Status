#include <stdio.h>
void main()
{
    int n, m, i = 0, flag = 0;
    printf("Enter the no. of elements present in A : ");
    scanf("%d", &n);
    int a[n];
    for (i = 0; i < n; i++)
    {
        printf("Enter element present at A[%d] : ", i);
        scanf("%d", &a[i]);
    }
    printf("Enter the no. of elements present in B : ");
    scanf("%d", &m);
    int b[m];
    for (i = 0; i < m; i++)
    {
        printf("Enter element present at B[%d] : ", i);
        scanf("%d", &b[i]);
    }
    printf("Union = ");
    for (i = 0; i < n; i++)
        printf("%d ", a[i]);
    for (i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (b[i] == a[j])
                flag = 1;
        }
        if (flag == 0)
            printf("%d ", b[i]);
        flag = 0;
    }
}