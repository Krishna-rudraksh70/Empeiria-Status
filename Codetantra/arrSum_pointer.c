#include <stdio.h>
#include <stdlib.h>

void main() {
    int sum=0, n, i;

    scanf("%d",&n);
    int *arr = (int*)malloc(n*sizeof(int));

    for(i=0;i<n;i++) {
        scanf("%d",&arr[i]);
        sum += arr[i];
    }

    printf("%d\n",sum);
    free(arr);

}