#include <stdio.h>
#define infinite 1000
void main()
{
    int cost[10][10], vstd[10] = {0}, i, j, n, n_e = 0, min, n1, n2, min_cost = 0;
    printf("Enter number of nodes : ");
    scanf("%d", &n);
    printf("Enter cost in form of adjacency matrix\n");
    for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
        {
            scanf("%d", &cost[i][j]);
            if (cost[i][j] == 0)
                cost[i][j] = infinite;
        }
    vstd[0] = 1;
    while (n_e < n)
    {
        min = infinite;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                if (cost[i][j] < min)
                    if (vstd[i] != 0)
                    {
                        min = cost[i][j];
                        n1 = i;
                        n2 = j;
                    }
        if (vstd[n2] == 0)
        {
            printf("%d to %d cost = %d\n", n1, n2, min);
            min_cost += min;
            n_e++;
        }
        vstd[n2] = 1;
        cost[n1][n2] = cost[n2][n1] = infinite;
    }
    printf("Minimum weight is %d.\n", min_cost);
}