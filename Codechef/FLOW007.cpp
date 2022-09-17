#include <bits/stdc++.h>
using namespace std;

void sol()
{
  long long num, rev=0;
  cin>>num;
  
  while(num>0)
  {
    rev = rev*10+num%10;
    num /= 10;
  }
  cout<<rev<<endl;
}

int main()
{
  int n;
  cin>>n;
  while (n--)
    sol();
  
  return 0;
}