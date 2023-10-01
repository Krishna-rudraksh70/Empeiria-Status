#include <iostream>
#include <cmath>
using namespace std;

// Approach 1: Brute Force
int fiboEvenSum(int n) {
    int a = 1, b = 2, sum = 0;

    while (b <= n) {
        if (b % 2 == 0) {
            sum += b;
        }

        int temp = a + b;
        a = b;
        b = temp;
    }

    return sum;
}

// Approach 2: Recursive
int fiboEvenSum(int n, int a = 1, int b = 2, int even_sum = 0) {
    if (a > n) {
        return even_sum;
    }
    if (a % 2 == 0) {
        even_sum += a;
    }
    return fiboEvenSum(n, b, a + b, even_sum);
}

int main() {
    int n = 4000000;
    int result = fiboEvenSum(n);
    cout << "Sum of even Fibonacci numbers not exceeding " << n << " is: " << result << endl;
    return 0;
}
