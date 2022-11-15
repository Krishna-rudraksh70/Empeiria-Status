#include <iostream>
#include<map>
#include<algorithm>
#include<string>
#include<vector>
using namespace std;
string solve(string a,string b){
    vector<int> q(27,0);
    for(int i=0;i<b.length();i++){
        int ch=b[i]-'a';
        q[ch]++;
       
    }
    string ans="";
    for(int i=0;i<a.length();i++){
        char cc=a[i];
        int ch=cc-'a';
        if(q[ch]==0){
            ans+=cc;
        }
        
    }
    return ans;
}
int main() {
   string a,b;
   cin>>a>>b;
   cout<<solve(a,b);
}