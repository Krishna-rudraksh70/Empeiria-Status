#include <stdio.h>

void main()
{

    int a[20], i, n, j, temp;
    printf("Enter value of n : ");
    scanf("%d", &n);
    // Write the for loop to read array elements
    for (i = 0; i < n; i++)
    {
        printf("Enter element for a[%d] : ", i);
        scanf("%d", &a[i]);
    }
    printf("Before sorting the elements in the array are\n");
    // Write the for loop to display array elements before sorting

    for (i = 0; i < n; i++)

        printf("Value of a[%d] = %d\n", i, a[i]);

    // Write the code to sort elements
    for (j = 0; j < n; j++)
        for (i = 0; i < n - 1 - j; i++)
            if (a[i] > a[i + 1])
            {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
    printf("After sorting the elements in the array are\n");
    // Write the for loop to display array elements after sorting
    for (i = 0; i < n; i++)
        printf("Value of a[%d] = %d\n", i, a[i]);
}