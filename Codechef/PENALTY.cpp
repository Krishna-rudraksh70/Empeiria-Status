#include<bits/stdc++.h>
using namespace std;

int sol(){
    
    int t1=0, t2=0, arr[10];
    
    for(int i=0; i<10; i++){
        
        cin>>arr[i];
        
        if(i&1)
            t2 += arr[i];
        else
            t1 += arr[i];
    }
    
    return((t1==t2)? 0:(t1>t2)? 1: 2);
    
}

int main(){
  int n;
  cin>>n;
  
  while(n-- > 0)
    cout<<sol()<<endl;
  
  return 0;
}