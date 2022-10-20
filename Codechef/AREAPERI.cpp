#include <iostream>

#include<bits/stdc++.h>

using namespace std;

void sol(){
  
  int l, b;
  cin>>l>>b;
  
  
  ((l*b)>(2*(l+b)))? cout<<"Area"<<endl<<l*b :  ((l*b)<(2*(l+b)))? cout<<"Peri"<<endl<<2*(l+b) : cout<<"Eq"<<endl<<l*b;
    
}

int main(){
 
    sol();
  
  return 0;
}