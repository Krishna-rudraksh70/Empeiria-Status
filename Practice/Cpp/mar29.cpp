// { Driver Code Starts
// C++ program to find number 
// of pairs in an array such
// that their XOR is 0
#include <bits/stdc++.h>
using namespace std;

// Function to calculate the
// count
long long int calculate(int a[], int n);

// Driver Code
int main()
{

	int t;
	cin>>t;
	while(t--)
	{
	  int n;
	  cin>>n;
	  int arr[n+1];
	  for( int i=0;i<n;i++)
	        cin>>arr[i];
	    cout << calculate(arr, n)<<endl;
        
	}
	return 0;
}

// } Driver Code Ends


long long int calculate(int a[], int n)
{
    // Complete the function
    map<int, int> m;
    for(int i = 0;i<n;i++){
        m[a[i]]++;
    }
    // for (auto i : m){
    //     cout << i.first << "   " << i.second<< endl;
    // }
    long long int noPairs =0;
    for (auto i : m){
        if(i.second > 1){
            int n = i.second;
            int x = ((n-1) * (n)/2);
            noPairs += x;
            // cout<<i.first<< "   "<<noPairs<<endl;
        }
    }
    return noPairs;
}
