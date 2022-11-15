#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int arr[n];
    set<int> s;
    for(int i =0;i<n;i++){
        cin>>arr[i];
        s.insert(arr[i]);
    }
    cout<<s.size();
    for (auto elem : s)
    {
        std::cout << elem << " , ";
    }
    // for(int i = 0;i<s.size();i++){
    //     cout<<s[i];
    // }
    // for (itr = s.begin(); itr != s.end(); itr++) {
    //     cout << *itr << " ";
    // }

    return 0;
}