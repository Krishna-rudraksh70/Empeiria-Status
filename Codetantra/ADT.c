// Implementing Array as an Abstract Data Type

#include<stdio.h>
#include<stdlib.h>

struct arr {
    int n;
    int m;
    int *ptr; 
};

void createArray(struct arr * a, int tsize, int usize) {
    a->n = tsize;
    a->m = usize;
    a->ptr = (int *)malloc(tsize * sizeof(int));

}

void display(struct arr * a) {
    for(int i = 0; i < a->m; i++) {
        printf("%d\n", (a->ptr)[i]);
    }
}

void val(struct arr * a) {
    int x;
    for(int i = 0; i < a->m; i++) {
        printf("Enter element %d: ", i);
        scanf("%d",&x);
        (a->ptr)[i] = x;
    }
}

int main() {
    struct arr marks;
    createArray(&marks, 10, 5);
    printf("1: Running val function\n");
    val(&marks);
    printf("2: Running display function\n");
    display(&marks);

    return 0;     
}