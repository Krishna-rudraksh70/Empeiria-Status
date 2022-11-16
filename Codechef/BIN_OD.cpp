#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define fr(i, a, b) for(int i=a; i<b; i++)
typedef long long ll;

void sol(){
    int n,q;
    cin>>n>>q;
    
    int a[64][n];
    
    fr(i, 0, n){
        ll x;
        cin>>x;
            
        fr(j, 0, 64){
            a[j][i] = (int)(x%2);
                x/=2;
        }
    }
    
    fr(i, 0, 64){
        ll count=0;
        fr(j, 0, n){
            count+=a[i][j];
            a[i][j]=count;
        }
        
    }

    while(q--){
        int l1,r1,l2,r2,k;
        cin>>k>>l1>>r1>>l2>>r2;
        l1--; l2--; r1--; r2--;
        
        int totalf=r1-l1+1, totals=r2-l2+1, totalfo, totalso;
        
        if(l1==0){
            totalfo=a[k][r1];
        }
        else{
            totalfo=a[k][r1]-a[k][l1-1];
        }
        
        if(l2==0){
            totalso=a[k][r2];
        }
        else 
            totalso=a[k][r2]-a[k][l2-1];
            
        ll sum=(ll)(totalf-totalfo)*(ll)(totalso)+ (ll)(totalfo)*(ll)(totals-totalso);
        
        cout<<sum<<endl;

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