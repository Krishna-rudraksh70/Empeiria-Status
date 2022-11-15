#include<iostream>
using namespace std;

int discrimant(int a, int b, int c){
    return (b*b)-(4*a*c);
}
int main()
{
    discrimant(1,4,2);
    return 0;
}