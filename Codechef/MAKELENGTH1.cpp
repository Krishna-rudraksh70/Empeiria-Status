// #include<iostream>
// #include<bits/stdc++.h>
// using namespace std;

// void sol(){
//   int n;
//   cin>>n;
  
//   string str;
//   cin>>str;
  
//   stack<char> s;
  
//   s.push(str[0]);
  
//   for(int i=1; i<n; i++){
//       if(s.top()==str[i]){
//           s.pop();
//           s.push(0);
//       }
//       else
//         s.push(str[i]);
//   }
  
//   if(s.size()==1)
//     cout<<"YES\n";
//   else{
//       char ch = s.top();
//       s.pop();
//       while(!s.empty() && s.top == ch)
//         s.pop();
        
//         if(s.empty())
//             cout<<"YES\n";
//         else
//             cout<<"NO\n";
//   }
// }

// int main(){

//     ios_base::sync_with_stdio (false);
//     cin.tie(NULL);cout.tie(NULL);

//     int t;
//     cin>>t;

//     while(t--)
//         sol();

//     return 0;
// }

#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    string str;
	    cin>>str;
	    stack<char>s;
	    s.push(str[0]);
	    for(int i=1; i<n; i++){
	        if(s.top()==str[i]){
	            s.pop();
	            s.push('0');
	        }
	        else
	        s.push(str[i]);
	    }
	    if(s.size()==1)
	    cout<<"YES"<<endl;
	    else{
	        char ch = s.top();
	        s.pop();
	        while(!s.empty() && s.top()==ch)
	        s.pop();
	        if(s.empty())
	        cout<<"YES"<<endl;
	        else
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}