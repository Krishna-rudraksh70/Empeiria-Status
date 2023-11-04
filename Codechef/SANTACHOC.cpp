#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
    int n, k, sum=0;
    cin>>n>>k;
    
    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[i];
        sum += arr[i];
    }
    
    if(sum < n)
        cout<<"NO"<<endl;
    else{
        int r = sum % n;
        if(k == 0 && r != 0)
            cout<<"NO"<<endl;
        else
            cout<<"YES"<<endl;
    }
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