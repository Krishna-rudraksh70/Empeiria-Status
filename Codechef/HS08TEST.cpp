// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

#include <bits/stdc++.h>
using namespace std;

int main()
{
    cout.precision(2);

    int a;
    float b;
    cin >> a >> b;
    
    if ((a%5==0) && (b-a-0.5>=0))
    {
        cout << fixed << b-a-0.5 << endl;
    }
    else
    {
        cout << fixed << b << endl;
    }

    return 0;
}