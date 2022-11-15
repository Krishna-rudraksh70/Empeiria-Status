#include<iostream>
#include<string>

using namespace std;

string removeDuplicates(string str) {
        int n = str.size();
        string res = "";
        for(int i = 0; i < n; i++)
        {
            if(res.size() > 0 && str[i] == res.back())
            {
                res.pop_back();
            }
            else 
            {
                res.push_back(str[i]);
            }
        }
        
        return res;
    }

int main()
{
    string s;
    cin>>s;
    cout<<removeDuplicates(s);
    return 0;
}