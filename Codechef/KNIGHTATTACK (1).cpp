#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void sol(){
  
	    
	    int a, b, c, d;
	    cin >> a >> b >> c >> d;
	    bool flag = false;
	    for (int i = 1; i <= 8; i ++){
	        if (i == a || i == c) continue;
	        for (int j = 1; j <= 8; j ++){
	            if (j == b || j == d) continue;
	            if (abs(a - i) * abs(b - j) == 2 && abs(c - i) * abs(d - j) == 2) flag = true;
	        }
	    }
	    if (flag) cout << "YES";
	    else cout << "NO";
	    
	    cout << '\n';
	   
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