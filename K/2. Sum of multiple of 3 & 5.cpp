#include <iostream>
using namespace std;

// Approach 1: Brute Force
int multiplesOf3and5_BruteForce(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
        }
    }
    return sum;
}

// Approach 2: Mathematical Formula
int multiplesOf3and5_MathematicalFormula(int number) {
    number--;  // Adjust to exclude the given number if it's a multiple of 3 or 5
    int sum = 0;
    
    int multiplesOf3 = number / 3;
    int multiplesOf5 = number / 5;
    int multiplesOf15 = number / 15;
    
    sum = (3 * multiplesOf3 * (multiplesOf3 + 1) / 2) +
          (5 * multiplesOf5 * (multiplesOf5 + 1) / 2) -
          (15 * multiplesOf15 * (multiplesOf15 + 1) / 2);
    
    return sum;
}

// Approach 3: Optimized Mathematical Formula
int multiplesOf3and5_OptimizedMathFormula(int number) {
    number--;  // Adjust to exclude the given number if it's a multiple of 3 or 5
    int sum = 0;
    
    int multiplesOf3 = number / 3;
    int multiplesOf5 = number / 5;
    int multiplesOf15 = number / 15;
    
    sum = (3 * multiplesOf3 * (multiplesOf3 + 1) / 2) +
          (5 * multiplesOf5 * (multiplesOf5 + 1) / 2) -
          (15 * multiplesOf15 * (multiplesOf15 + 1) / 2);
    
    return sum;
}

int main() {
    int number = 10;  // Change the value of 'number' as needed
    int result1 = multiplesOf3and5_BruteForce(number);
    int result2 = multiplesOf3and5_MathematicalFormula(number);
    int result3 = multiplesOf3and5_OptimizedMathFormula(number);
    
    cout << "Brute Force Approach: " << result1 << endl;
    cout << "Mathematical Formula Approach: " << result2 << endl;
    cout << "Optimized Mathematical Formula Approach: " << result3 << endl;
    
    return 0;
}
