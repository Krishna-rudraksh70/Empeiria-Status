#include<bits/stdc++.h>

using namespace std;

using ll=long long int;
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    int t=0;
    cin >> t;
    while(t--)
    {
        ll n=0,p=0;
        bool fnd=false;
        cin >> n;
        // Idea is to check for largest power of two less than n 
        // so that n become small and take less time for triplet computation and then evenly spread power to both operands.
        while(n%2!=1)
        {
            p+=1;
            n>>=1;
        }
        if(p%2==1)
        {
            p-=1;
            n*=2;
        }
        for(ll i=0;i*i<=n;i++)
        {
            ll a=0,b=0,y=0;
            a=i;
            b=n-(i*i);
            y=sqrt(b);
            if(y*y==b)
            {
                a<<=(p/2);
                y<<=(p/2);
                cout << a << " " << y << "\n";
                fnd=true;
                break;
            }
        }
        if(!fnd)
        {
            cout << "-1\n";
        }
    }
    return 0;
}