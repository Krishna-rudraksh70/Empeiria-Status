#include<bits/stdc++.h>
typedef long long int ll;
using namespace std;

void solve(){
ll n;
cin>>n;
string s[n];
ll ans=0;
for(int i=0;i<n;i++){
    cin>>s[i];
} 
for(int i=0;i<s[0].size();i++){
    ll ans1=0;
    for(int j=0;j<n;j++){
        ll x=s[j][i]-'0';
        ans1^=x;
    }
    ans+=ans1;
}
cout<<ans<<endl;
}

int main()
{
ios::sync_with_stdio(0);
cin.tie(0);

ll T;
cin>>T;
while(T--){
solve();
}
    
    return 0;
}