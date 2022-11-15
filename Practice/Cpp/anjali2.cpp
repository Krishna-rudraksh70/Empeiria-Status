#include<iostream>
using namespace std;

int main()
{
    int n,m;
    cin>>n>>m;
    int x=n;
    int y=m;
    int arr[n][m];
    string s;
    cin>>s;

    for(int i =0;i<s.size();i++){
        if(s[i] == 'L'){
            m--;
        }
        if(s[i] == 'R'){
            m++;
        }
        if(s[i] == 'F'){
            n--;
        }
        if(s[i] == 'B'){
            n++;
        }
        
    }
        if(!(n<0 || n>=x || m<0 || m>=y)){
                cout<<"Safe";}
        else{
            cout<<"Unsafe";
        }
    
    return 0;
}