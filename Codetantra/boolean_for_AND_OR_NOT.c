#include <stdio.h>
#include <stdlib.h>
int main()
{
    int ch, a, b;
    while (1)
    {
        printf("1 OR\n2 AND\n3 NOT\n4 EXIT\nEnter your choice : \n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            printf("Give two input 1 for true and 0 for false\n");
            scanf("%d %d", &a, &b);
            printf("%d and(&) %d : %d\n", a, b, a & b);
            break;
        case 2:
            printf("Give two input 1 for true and 0 for false\n");
            scanf("%d %d", &a, &b);
            printf("%d or(|) %d : %d\n", a, b, a | b);
            break;
        case 3:
            printf("Give one input 1 for true and 0 for false\n");
            scanf("%d", &a);
            printf("NOT %d : %d\n", a, !a);
            break;
        case 4:
            exit(0);
        default:
            printf("Wrong key\n");
        }
    }
}