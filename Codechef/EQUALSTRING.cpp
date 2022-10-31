#include<iostream>
#include<bits/stdc++.h>
using namespace std;

#define fr(i, a, b) for(int i = a; i< b; i++)

void sol(){
    int n;
    cin>>n;

    string s1, s2;
    cin>>s1>>s2;

    set<char> s;

    fr(i, 0, n)
        if(s1[i]!=s2[i])
            s.insert(s2[i]);

    cout<<s.size()<<endl;
}

int main(){

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}