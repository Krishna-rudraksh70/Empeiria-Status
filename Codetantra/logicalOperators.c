#include <stdio.h>
int main()
{
    int a = 36, b = 79, c = 70, res;
    

    res = (a == b) && (c > b);
    printf("(a == b) && (c > b) is %d \n", res);

    res = (a == b) && (c < b);
    printf("(a == b) && (c < b) is %d \n", res);

    res = (a == b) || (c < b);
    printf("(a == b) || (c < b) is %d \n", res);

    res = (a != b) || (c < b);
    printf("(a != b) || (c < b) is %d \n", res);

    res = !(a != b);
    printf("!(a != b) is %d \n", res);

    res = !(a == b);
    printf("!(a == b) is %d \n", res);

    res = !(a % b);
    printf("!(a % b) is %d \n", res);

    res = !((a+1)%b);
    printf("!((a+1)%b) is %d \n", res);

    return 0;
}