#include <iostream>
using namespace std;

bool isprime(int n){
    
    if(n==1)
        return false;
        
    for(int i=2; i*i<=n; i++)
        if(n%i==0)
            return false;
            
    return true;
    
}

void sol()
{
    int n;
    cin>>n;
    
    if(isprime(n))
        cout<<"yes"<<endl;
    else
        cout<<"no"<<endl;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
        sol();
    
    return 0;
}