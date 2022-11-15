#include<bits/stdc++.h>
using namespace std;

int nooo(string str,char s){
    int count = 0;
    int n = str.size();
    for(int i = 0;i<n;i++){
        if(str[i] == s)
        count++;
    }
    return count;
}

char lex(string str, int k){
    char res = ' ';
    sort(str.begin(),str.end());
    res = str[k];
    return res;
}

int main()
{
    string str;
    getline(cin, str);
    int k;
    cin>> k;
    char s = lex(str, k);
    cout<< s <<endl;
    cout<< nooo(str,s);
    return 0;
}