#include <stdio.h>
void main()
{
    int i, j, n, mat = 1;
    printf("Enter the number of elements in set: ");
    scanf("%d", &n);
    int a[n];
    printf("Enter the elements of Array: ");
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);
    printf("Relation :{ ");
    for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
        {
            if ((a[i] + a[j]) % 2 == 0)
                printf("(%d,%d) ", a[i], a[j]);
        }
    printf("}\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("%d ", mat);
            if (mat == 1)
                mat = 0;
            else
                mat = 1;
        }
        printf("\n");
        if (n % 2 == 0)
            if (mat == 1)
                mat = 0;
            else
                mat = 1;
    }
    printf("1. Relation is symmetric\n2. Relation is reflexive\n3. Relation is transitive\n");
}