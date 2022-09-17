#include <bits/stdc++.h>
using namespace std;

bool sol() {
  long long int x, y, z;
  cin>>x>>y>>z;

  return (y <= (x+(2*z)));
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