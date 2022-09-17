#include<iostream>
using namespace std;
int main()
{
    
    int n, e=0, o=0;
    cin>>n;
    
    while(n--)
    {
        int w;
        cin>>w;
        if(w%2==0)
            e++;
        else
            o++;
    }
    
    if(e>o)
        cout<<"READY FOR BATTLE"<<endl;
    else
        cout<<"NOT READY"<<endl;
    
    return 0;
}