#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
  
  int n;
  cin>>n;
  
  while(n--)
  {
    int s, x, y, k=0;
    cin>>s>>x>>y;
    
    int arr[s];
    
    for(int i=0; i<s; i++)
    {
      cin>>arr[i];
      if(arr[i]%y==0 && arr[i]<=x)
        k++;
    }
    
    cout<<k<<endl;
  }
  
  return 0;
}