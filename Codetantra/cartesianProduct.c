#include <stdio.h>
void main()
{
    int n_a, n_b, i, j;
    printf("Enter size of set A : ");
    scanf("%d", &n_a);
    int a[n_a];
    printf("Enter element of set A : ");
    for (i = 0; i < n_a; i++)
        scanf("%d", &a[i]);
    printf("Enter size of set B : ");
    scanf("%d", &n_b);
    int b[n_b];
    printf("Enter element of set B : ");
    for (i = 0; i < n_b; i++)
        scanf("%d", &b[i]);
    printf("{ ");
    for (i = 0; i < n_a; i++)
        for (j = 0; j < n_b; j++)
            printf(" (%d, %d) ", a[i], b[j]);
    printf("}");
}