#include <stdio.h>
#include <math.h>
int i, j;
void powerSet(int set[], int n)
{
    int setSize = pow(2, n);
    printf("Power set of given set : ");
    printf("{ ");
    for (i = 0; i < setSize; i++)
    {
        printf("{ ");
        for (j = 0; j < n; j++)
        {
            if (i & (1 << j))
                printf("%d ", set[j]);
        }
        printf("} ");
    }
    printf("}");
}
void main()
{
    int n;
    printf("Enter no. of elements : ");
    scanf("%d ", &n);
    int set[n];
    for (i = 0; i < n; i++)
        scanf("%d", &set[i]);
    powerSet(set, n);
}