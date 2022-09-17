#include <bits/stdc++.h>
using namespace std;

bool sol() {
  long long int x, y, n;
  cin>>n>>x>>y;

  return ((n+1)*y >= x);
}

int main() {
  int n;
  cin>>n;

  while(n--){
    if(sol())
      cout<<"YES\n";
    else
      cout<<"NO\n";
  }

  return 0;
}