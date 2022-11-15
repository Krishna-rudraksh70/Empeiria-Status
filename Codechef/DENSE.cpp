#include<iostream>
#include<bits/stdc++.h>
using namespace std;


void sol(){
  int n;
	    int l = 0, count = 0;
	    cin>>n;
	    int r = n-1;
	    string s;
	    cin>>s;
	    while(l<=r){
	        if(s[l] != '('){
	            count++;
	            l++;
	        }
	        if(s[r] != ')'){
	            count++;
	            r--;
	        }
	        if((s[l] == '(') && (s[r] == ')')){
	            r--;
	            l++;
	        }
	        if(l == r){
	            count++;
	            break;
	        }
	    }
	    cout<<count<<endl;
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