#include <bits/stdc++.h>
using namespace std;

bool sol() {
  int svn[7], k=0;
  
  for(int i = 0; i < 7; i++){
    cin>>svn[i];
    k += svn[i];
  }

  return (k > 3);
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