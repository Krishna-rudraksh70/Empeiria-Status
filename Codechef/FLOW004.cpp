// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

#include<bits/stdc++.h>

using namespace std;
#define el endl;

int main()
{
   
   int t;
   cin>>t;
   while(t--)
   {
       int n;
       cin>>n;
       int rem = n%10;
       while(n>9)
       {
           n = n/10;
       }
       cout<<n+rem<<el;
   }
   
return 0;

}


