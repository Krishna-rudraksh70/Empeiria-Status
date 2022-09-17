#include <stdio.h>

int i, j;

void swap(int *a, int *b)
{

    int t = *a;
    *a = *b;
    *b = t;
}

void display(int arr[], int n)
{
    for (i = 0; i < n; ++i)
        printf("%d ", arr[i]);
    printf("\n");
}
int partition(int arr[], int lb, int ub)
{
    int pivot = arr[ub];
    i = lb - 1;
    for (j = lb; j < ub; j++)
        if (arr[j] <= pivot)
            swap(&arr[++i], &arr[j]);
    swap(&arr[i + 1], &arr[ub]);
    return (i + 1);
}
void quickSort(int arr[15], int l, int h)
{
    if (l < h)
    {
        int pi = partition(arr, l, h);
        quickSort(arr, l, pi - 1);
        quickSort(arr, pi + 1, h);
    }
}

void main()
{
    int arr[15], n;
    printf("Enter array size : ");
    scanf("%d", &n);
    printf("Enter %d elements : ", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Before sorting the elements are : ");
    display(arr, n);
    quickSort(arr, 0, n - 1);
    printf("After sorting the elements are : ");
    display(arr, n);
}