#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define fr(i, a, b) for(int i = a; i< b; i++)

void sol(){
    int n;
    cin>>n;
    
    n = (n>100)? n-10 : n;
    
    cout<<n<<endl;
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}