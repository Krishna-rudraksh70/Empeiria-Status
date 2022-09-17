#include <bits/stdc++.h>
using namespace std;

void sol()
{
  int sum=0;
  long long num;
  cin>>num;
  
  while(num > 0)
  {
    sum += num%10;
    num /= 10;
  }
  cout<<sum<<endl;
}

int main()
{
  int n;
  cin>>n;
  while (n--)
    sol();
  
  return 0;
}