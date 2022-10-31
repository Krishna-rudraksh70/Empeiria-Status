#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int n;
    cin>>n;
    
    int arr[n];
    bool flag = false;
    
    
    cin>>arr[0];
    for(int i=1; i<n; i++){
        cin>>arr[i];
        
        if(arr[i] < arr[i-1])
            flag = true;
    }
    
    (!flag)? cout<<"YES"<<endl:cout<<"NO"<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}