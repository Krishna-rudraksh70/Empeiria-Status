#include<iostream>
using namespace std;

float moneySaved(struct item list[], int m){
    if(m ==0 )
    return -1;
    float ans = 0.0;
    for(int i =0;i<m;i ++){
        ans += ((list[i].qty * list[i].price * list[i].dis)/100);
    }
    return ans;
}

int main()
{
    cout<<moneySaved()
    return 0;
}