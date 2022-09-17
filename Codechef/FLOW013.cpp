#include <bits/stdc++.h>
using namespace std;

void sol()
{
  
  int x, y, z;
  cin>>x>>y>>z;
  
  if(x+y+z==180)
    cout<<"YES\n";
  else
    cout<<"NO\n";
}

int main()
{
  int n;
  cin>>n;
  while (n--)
    sol();
  
  return 0;
}