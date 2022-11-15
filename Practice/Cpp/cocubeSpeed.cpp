#include<iostream>
using namespace std;

int speed(bool direction, int speed1, int time1, int speed2, int time2){
    int distance1 = speed1*time1;
    int distance2 = speed2*time2;

    if(direction==1){
        return distance1-distance2;
    }
    else{
        return distance1 + distance2;
    }
}
int main()
{
    cout<<speed(0, 30, 12, 20, 6);
    return 0;
}