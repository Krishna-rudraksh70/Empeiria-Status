#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  
	    int x,y;
	    int a,b;
	    cin>>x>>y;
	    cin>>a>>b;
	    int arr11[8];
	    int arr12[8];
	    int arr21[8];
	    int arr22[8];
	    arr11[0]=x-2;
	    arr12[0]=y+1;
	    arr11[1]=x-2;
	    arr12[1]=y-1;
	    arr11[2]=x-1;
	    arr12[2]=y+2;
	    arr11[3]=x-1;
	    arr12[3]=y-2;
	    arr11[4]=x+2;
	    arr12[4]=y+1;
	    arr11[5]=x+2;
	    arr12[5]=y-1;
	    arr11[6]=x+1;
	    arr12[6]=y+2;
	    arr11[7]=x+1;
	    arr12[7]=y-2;
	    arr21[0]=a-2;
	    arr22[0]=b+1;
	    arr21[1]=a-2;
	    arr22[1]=b-1;
	    arr21[2]=a-1;
	    arr22[2]=b+2;
	    arr21[3]=a-1;
	    arr22[3]=b-2;
	    arr21[4]=a+2;
	    arr22[4]=b+1;
	    arr21[5]=a+2;
	    arr22[5]=b-1;
	    arr21[6]=a+1;
	    arr22[6]=b+2;
	    arr21[7]=a+1;
	    arr22[7]=b-2;
	    string ans="NO";
	    for(int i=0;i<8;i=i+1){
	        for(int j=0;j<8;j=j+1){
	            if(arr11[i]==arr21[j] && arr12[i]==arr22[j] && (arr11[i]>=1 && arr11[i]<=8) && (arr12[i]>=1 && arr12[i]<=8)){
	                    ans="YES";
	            }
	        }
	    }
	    cout<<ans<<endl;
	
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