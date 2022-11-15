#include<iostream>
#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

void sol(){
    string s;
    cin>>s;
    
    ll n = s.size(), odd=0, even=0;
    
    for(int i=0; i<n; i++)
        if(s[i] == '1')
            (i&1)? odd++: even++;
            
    if(abs(odd - even) % 3 == 0){
        cout<<"0"<<endl;
        return;
    }
    
    ll f=0, x=0;
    for(int i=1; i<n; i++)
        if(s[i] != s[i-1])
            f++;
            
    if(f == 1){
        for(int i=1; i<n; i++){
            if(((i&1) or (n-1)%1) and (s[i] != s[i-1]) and i != 1 and i != n-1){
                cout<<"3"<<endl;
                return;
            }
        }
    }
    
    if(abs(odd - even) % 3 == 2){
        if((odd + even) == n)
            cout<<"-1"<<endl;
        else
            cout<<"1"<<endl;
    }
    else{
        if(even + odd > n-1)
            cout<<"-1"<<endl;
        else{
            bool flag = false;
            
            for(int i=0; i<n; i++){
                if(even > odd){
                    if(i%2 != 0 and s[i] == '1'){
                        if(((i-1) >= 0) and (s[i-1]) == '0'){
                            flag = true;
                            break;
                        }
                        if(i+1<n and s[i+1] == '0'){
                            flag = true;
                            break;
                        }
                    }
                }
                else{
                    if(i%2 ==0 and s[i] == '1'){
                        if((i-1) >= 0 and s[i-1] == '0'){
                            flag = true;
                            break;
                        }
                        if(i+1<n and s[i+1] == '0'){
                            flag = true;
                            break;
                        }
                    }
                }
            }
            
            if(flag)
                cout<<'1'<<endl;
            else{
                if(odd + even == n-1)
                    cout<<"-1"<<endl;
                else{
                    if(odd > even){
                        int c = 0;
                        for(int i=0; i<n; i++)
                            if(i%2 == 0)
                                c++;
                                
                        if(odd<2 or c<2)
                            cout<<"-1"<<endl;
                        else
                            cout<<"2"<<endl;
                    }
                    else{
                        int c =0;
                        for(int i=0; i<n; i++)
                            if(i%2 != 0)
                                c++;
                                
                        if(even < 2 or c < 2)
                            cout<<"-1"<<endl;
                        else
                            cout<<"2"<<endl;
                    }
                }
            }
        }
    }
}

int main(){

    ios_base::sync_with_stdio (false);
    cin.tie(NULL);cout.tie(NULL);

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}