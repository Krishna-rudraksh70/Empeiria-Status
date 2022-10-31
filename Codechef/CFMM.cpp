#include<iostream>
#include<bits/stdc++.h>

#define fr(i, a, b) for(int i=a; i<b; i++)
#define vi(a, b) vector<int> v(a, b)
#define m(a) *min_element(a.begin(), a.end())
#define br break
using namespace std;

int meal_count(string s){

    vi(6, 0);

    fr(i, 0, s.size()){

        switch(s[i]){
            case 'c':
                v[0]++;
                br;
            case 'o':
                v[1]++;
                br;
            case 'd':
                v[2]++;
                br;
            case 'e':
                v[3]++;
                br;
            case 'h':
                v[4]++;
                br;
            case 'f':
                v[5]++;
                br;
        }
    }

    v[0] /= 2;
    v[3] /= 2;

    return m(v);
}

void sol(){
    int n;
    cin>>n;

    string s;

    fr(i, 0, n){
        string s1;
        cin>>s1;
        s += s1;
    }

    cout<<meal_count(s)<<endl;

}

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    int t;
    cin>>t;

    while(t--)
        sol();

    return 0;
}