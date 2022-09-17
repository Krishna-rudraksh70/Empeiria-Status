#include <bits/stdc++.h>
using namespace std;

bool sol() {
  long int m, n, k;
  cin>>m>>n>>k;

  return (m > (n*k));
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