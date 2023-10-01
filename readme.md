<h1 style="font-size: 40px;">K.</h2>

<h2 style="font-size: 20px;">1. Two Sum</h2>

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109

3 approaches 
<h2 style="font-size: 15px;">Brute Force approach</h2>

```bash
vector<int> twoSum(vector<int>& nums, int target) {
    vector<int> result;

    for (int i = 0; i < nums.size(); ++i) {
        for (int j = i + 1; j < nums.size(); ++j) {
            if (nums[i] + nums[j] == target) {
                result.push_back(i);
                result.push_back(j);
                return result;
            }
        }
    }

    return result;
}
```

<h2 style="font-size: 15px;">Two pointer approach</h2>

```bash
vector<int> twoSum(vector<int>& nums, int target) {
    vector<int> sorted_nums = nums;
    sort(sorted_nums.begin(), sorted_nums.end());

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
```
<h2 style="font-size: 15px;">Hash-Map approach</h2>

```bash
vector<int> twoSum(vector<int>& nums, int target) {
    unordered_map<int, int> numToIndex;
    vector<int> result;

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
```