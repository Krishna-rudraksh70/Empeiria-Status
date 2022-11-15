#include<iostream>
using namespace std;

findSum(int arr[], int n, int target){
    for(int i =0;i<n;i++){
        for(int j =0;j<n;j++){
            if(arr[i] + arr[j] == target){
                return i + j;
            }
        }
    }
}

int main()
{
    cout<<findSum(arr, 9, 14);
    return 0;
}