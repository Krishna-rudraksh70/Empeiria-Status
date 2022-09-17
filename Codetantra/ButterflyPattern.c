#include <stdio.h>

int main() {
    int n,i,j;
    // size
    scanf("%d",&n);
    // Left wing
    for(i=1;i<n;i++) {
        for(j=1;j<=i;j++) {
            printf("%d ",j);          
        }
        for(j=1;j<=2*n-2*i;j++) {
            printf("  ");
        }
        for(j=i;j>=1;j--) {
            printf(" %d",j);          
        }
        printf("\n");
    }
    // Right wing
    for(i=n;i>=1;i--) {
        for(j=1;j<=i;j++) {
            printf("%d ",j);           
        }
        for(j=1;j<=2*n-2*i;j++) {
            printf("  ");
        }
        for(j=i;j>=1;j--) {
            printf(" %d",j);          
        }
        printf("\n");
    }
    return 0;
}

// Output
/* Butterfly pattern
    n=5
    1                  1
    1 2              2 1
    1 2 3          3 2 1
    1 2 3 4      4 3 2 1
    1 2 3 4 5  5 4 3 2 1
    1 2 3 4      4 3 2 1
    1 2 3          3 2 1
    1 2              2 1
    1                  1
*/