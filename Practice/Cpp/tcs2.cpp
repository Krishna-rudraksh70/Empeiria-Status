#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n,m;
    cin>>n,m;
    int c =0;
    m = 0;
    n =0;
    int arr[n][m];
    for(int i =0;i<n;i++){
        for(int j =0;j<m;j++){
            cin>>arr[i][j];
        }
    }
    for(int i =0;i<n;i++){
        for(int j =0;j<m-1;j++){
            if(arr[i][j]==1 && arr[i][j+1] == 1){
                m+=2;
                arr[i][j] = 0;
                arr[i][j+1]=0;
            }
        }
        for(int x =0;x<m;x++){
            if(arr){
                c++;
            }
        }
   }
    int b = 0;
    while(c!=0){
    if(b%2==0){
        n+=1;
    }
    else{
        m+=1;
    }
    b+=1;
    c-=1;
   }
    return 0;
}