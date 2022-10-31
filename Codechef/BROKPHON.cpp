#include<iostream>
#include<bits/stdc++.h>

#define ll long long
using namespace std;

void sol(){
    int n; cin>>n;
    vector<ll> arr(n);

    for(int i=0;i<n;i++)
        cin>>arr[i];
    int ans=0;
    for(int i=0;i<n-1;i++){
        if(arr[i]!=arr[i+1]){
            if(i>0&&arr[i-1]!=arr[i])
                ans++;
            else
                ans+=2;
        }
    }
    cout<<ans<<endl;

}

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}