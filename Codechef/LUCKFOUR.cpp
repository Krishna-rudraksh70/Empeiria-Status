#include <bits/stdc++.h>
using namespace std;

void sol()
{
  int k=0;
  long long num;
  cin>>num;
  
  while(num > 0)
  {
    if(num%10 == 4)
      k++;
    num /= 10;
  }
  cout<<k<<endl;
}

int main()
{
  int n;
  cin>>n;
  while (n--)
    sol();
  
  return 0;
}