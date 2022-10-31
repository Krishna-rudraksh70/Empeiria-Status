#include <bits/stdc++.h>
using namespace std;

int main()
{
   int t;
   cin>>t;
   while(t--)
   {
       int n,k,a[100000],b[100000]={0};
       cin>>n>>k;
       for(int i=0;i<n;i++) cin>>a[i];
       for(int i=0;i<n;i++)
       {
           if(a[i]-1==i) b[i]=-1;
           else if(b[a[i]-1]!=-1) b[a[i]-1]++;
       }
       int ans=0;
       for(int i =0;i<n;i++) if(b[i]>=k) ans++;
       cout<<ans<<"\n";
   }
}