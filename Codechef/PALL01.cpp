#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int reverse(int n){
    
    int r=0;
    
    while(n > 0){
        r = r*10 + (n%10);
        n /= 10;
    }
    
    return r;
}

void sol(){
    int n, r;
    cin>>n;
    
    r = reverse(n);
  
    cout<<((n==r)?"wins":"loses")<<endl;
}

int main(){

    ios_base::sync_with_stdio (false);
    cin.tie(NULL);cout.tie(NULL);

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}