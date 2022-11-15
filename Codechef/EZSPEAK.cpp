#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
	    int n;
	    cin>>n;
	    string s;
	    cin>>s;
	    int cnt = 0;
	    for(int i=0;i<n;i++)
	    {
	        if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
	        {
	            cnt = 0;
	        }
	        else
	        {
	            cnt++;
	            if(cnt==4)
	            {
	                cout<<"NO\n";
	                break;
	            }
	        }
	    }
	    if(cnt!=4)
	    cout<<"YES\n";

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