#include <bits/stdc++.h>
using namespace std;

void sol()
{
    long long int n, k;
    cin>>n>>k;
        
    long long int d[n], r[n], a[n];
        
        for(int i=0;i<2*n;++i)
        {
            if(i<n)
                cin>>d[i];
            else
            {
                cin>>r[i-n];
                
                a[i-n]=d[i-n]*k+r[i-n];
            }
        }
        
        cout<< *min_element(a, a + n)<<endl;
}

int main()
{
    int n;
    cin>>n;
    
    while(n--)
        sol();
    
    return 0;
}