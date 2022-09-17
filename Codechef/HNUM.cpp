#include <bits/stdc++.h>
using namespace std;

bool sol() {
  long long int n, k=0, kd;
  cin>>n;
  kd = n;

  while(n > 0) {
    k = k+(n%10);
    n = n/10;
  }
 
  return (kd % k == 0);
}

int main() {
  int n;
  cin>>n;

  while(n--){
    if(sol())
      cout<<"Yes\n";
    else
      cout<<"No\n";
  }

  return 0;
}