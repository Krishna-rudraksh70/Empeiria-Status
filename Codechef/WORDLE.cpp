#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;

    while(n--)
    {
        string s, t;
        cin>>s;
        cin>>t;
        int i=0;
        while(i<5)
        {
            if(s[i] == t[i])
                cout<<"G";
            else
                cout<<"B";
                i++;
        }
        cout<<endl;
    }
    return 0;
}