#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define fr(i, a, b) for(int i=a; i<b; i++)

void sol()
{
    int n, c=0;
    cin>>n;
    
    int arr[n];
    
    fr(i, 0, n){
        cin>>arr[i];
    }
    
    sort(arr, arr+n);
    
    for(auto e:arr){
        if(e <= c)
            c++;
        else
            break;
    }
    
    cout<<c<<endl;
    
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}