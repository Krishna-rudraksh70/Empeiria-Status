#include <stdio.h>
void main()
{
    int k = 0, n, flag = 0;
    printf("Enter the no. of elements : ");
    scanf("%d", &n);
    int a[n], b[n], c[2 * n];
    printf("Enter the elements of set A : ");
    for (int i = 0; i < n; i++)
        scanf("%d", &a[i]);
    printf("Enter the elements of set B : ");
    for (int i = 0; i < n; i++)
        scanf("%d", &b[i]);
    printf("Difference A-B :");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
            if (a[i] == b[j])
                flag = 1;
        if (flag == 0)
        {
            printf(" %d", a[i]);
            c[k] = a[i];
            k++;
        }
        flag = 0;
    }
    printf("\n");
    printf("Difference B-A :");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
            if (b[i] == a[j])
                flag = 1;
        if (flag == 0)
        {
            printf(" %d", b[i]);
            c[k] = b[i];
            k++;
        }
        flag = 0;
    }
    printf("\n");
    printf("Symmetric Difference:");
    for (int i = 0; i < k; i++)
        printf(" %d", c[i]);
    printf("\n");
}