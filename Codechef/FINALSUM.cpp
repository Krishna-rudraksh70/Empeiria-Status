#include <iostream>
#include <bits/stdc++.h>
#define ll long long int
using namespace std;

void sol()
{
    int n, q, i;
    cin>>n>>q;

    int arr[n];
    ll sum =0;
    
    for(i=0; i<n; i++){
        cin>>arr[i];
        sum += arr[i];
    }
    
    int qur[q][2];;
    
    for(i=0; i<q; i++){
        cin>>qur[i][0];
        cin>>qur[i][1];
    }
    
    for(i=0; i<q; i++){
        int t = qur[i][1] - qur[i][0];
        
        if((++t)%2==0)
            continue;
        else
            sum++;
    }
    
    cout<<sum<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}