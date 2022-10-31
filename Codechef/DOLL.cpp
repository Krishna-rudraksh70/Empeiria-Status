#include<iostream>
#include<bits/stdc++.h>

#define fr(i, a, b) for(int i=a; i<b; i++)
using namespace std;

void sol(){
    int n, k, out=0;
    cin>>n>>k;

    int arr[n];

    fr(i, 0, n){
        cin>>arr[i];
        out = (arr[i] > k)?out + 1 : out;
    }
    
    cout<<out<<endl;

}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}