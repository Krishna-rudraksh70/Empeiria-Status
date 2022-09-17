#include <bits/stdc++.h>
using namespace std;

void sol()
{
  int n, i;
  cin>>n;
  
  long long evens=0, odds=0, arr[n];
  
  for(i=0; i<n; i++)
  {
    cin>>arr[i];
    if(i%2 == 0)
      evens += arr[i];
    else
      odds += arr[i];
  }
  
  cout<<max(evens, odds)<<endl;
}

int main()
{
  int n;
  cin>>n;
  while (n--)
    sol();
  
  return 0;
}