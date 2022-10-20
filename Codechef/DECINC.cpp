#include <bits/stdc++.h>
using namespace std;

void sol()
{
    int n;
    cin>>n;
    
    n = (n%4==0)? ++n:--n;
    
    cout<<n<<endl;
}

int main(){
        sol();
    
    return 0;
}