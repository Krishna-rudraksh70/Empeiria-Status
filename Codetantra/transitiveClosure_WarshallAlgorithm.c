#include <stdio.h>
void main()
{
    int i, j, k, n;
    printf("Enter the size of Array ");
    scanf("%d", &n);
    int arr[n][n];
    for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
        {
            printf("Enter the Element present at a[%d][%d] ", i + 1, j + 1);
            scanf("%d", &arr[i][j]);
        }
    printf("transitive closure\n");
    for (k = 0; k < n; k++)
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                if (arr[i][k] == 1 && arr[k][j] == 1)
                    arr[i][j] = 1;
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
            printf(" %d", arr[i][j]);
        printf("\n");
    }
}