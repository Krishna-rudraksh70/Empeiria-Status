#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define fres(i, a, b) for(int i = a; i*i<=b; i++)

void sol(){
    int x, y, c=0, n;
    cin>>x>>y;

    n = abs(x-y);

    fres(i, 1, n)
        if(n%i==0)
            if(n/i != i)
                c += 2;
            else
                c++;

    cout<<c<<endl;
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}