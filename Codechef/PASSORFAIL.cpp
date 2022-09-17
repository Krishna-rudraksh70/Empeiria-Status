#include <bits/stdc++.h>
using namespace std;

bool sol() {
  long long int x, p, n;
  cin>>n>>x>>p;

  return ((x*3)-(n-x) >= p);
}

int main() {
  int n;
  cin>>n;

  while(n--){
    if(sol())
      cout<<"PASS\n";
    else
      cout<<"FAIL\n";
  }

  return 0;
}