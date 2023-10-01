#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_map>

//Brute Force approach
std::vector<int> twoSum(std::vector<int>& nums, int target) {
    std::vector<int> result;

    for (int i = 0; i < nums.size(); ++i) {
        for (int j = i + 1; j < nums.size(); ++j) {
            if (nums[i] + nums[j] == target) {
                result.push_back(i);
                result.push_back(j);
                return result;
            }
        }
    }

    return result; // No valid solution found
}

// Two pointer approach
std::vector<int> twoSum(std::vector<int>& nums, int target) {
    std::vector<int> sorted_nums = nums;
    std::sort(sorted_nums.begin(), sorted_nums.end());

    int left = 0;
    int right = sorted_nums.size() - 1;

    while (left < right) {
        int sum = sorted_nums[left] + sorted_nums[right];

        if (sum == target) {
            // Find the indices of the numbers in the original array
            int num1 = sorted_nums[left];
            int num2 = sorted_nums[right];
            int index1 = -1, index2 = -1;

            for (int i = 0; i < nums.size(); ++i) {
                if (nums[i] == num1 && index1 == -1) {
                    index1 = i;
                } else if (nums[i] == num2) {
                    index2 = i;
                }
            }

            return {index1, index2};
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }

    // No valid solution found
    return {};
}

//Hash-Map approach
std::vector<int> twoSum(std::vector<int>& nums, int target) {
    std::unordered_map<int, int> numToIndex;
    std::vector<int> result;

    for (int i = 0; i < nums.size(); ++i) {
        int complement = target - nums[i];

        // Check if the complement exists in the map
        if (numToIndex.find(complement) != numToIndex.end()) {
            result.push_back(numToIndex[complement]);
            result.push_back(i);
            return result;
        }

        // Add the current number and its index to the map
        numToIndex[nums[i]] = i;
    }

    return result; // No valid solution found
}

int main() {
    std::vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    
    std::vector<int> result = twoSum(nums, target);

    if (!result.empty()) {
        std::cout << "Indices: [" << result[0] << ", " << result[1] << "]" << std::endl;
    } else {
        std::cout << "No valid solution found." << std::endl;
    }

    return 0;
}
