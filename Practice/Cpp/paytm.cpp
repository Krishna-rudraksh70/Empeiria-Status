#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int getPotential(int potential[], int k){
    deque<int> q;
    for(int i=0;i<potential.size();i++){
        q.push_back(potential[i]);
    }

    int flag = 0;

    while(flag < k){

    int a = q.front();
    q.pop_front();
    int b = q.front();
    q.pop_front();

    if(a>=b){
        q.push_front(a);
        q.push_back(b);
    }else{
        q.push_front(b);
        q.push_back(a);
    }

    k++;
    }
}

int main()
{
    int n,k;
    cin>>n>>k;
    vector<int> potential;
    for(int i =0;i<n;i++){
        cin>>potential[i];
    }
    getPotential(potential[],2);
    return 0;
}