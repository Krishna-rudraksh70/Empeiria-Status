<h1 style="font-size: 40px;">K.</h2>

<h2 style="font-size: 25px;">1. Two Sum</h2>

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.<br/>
You may assume that each input would have exactly one solution, and you may not use the same element twice.<br/>
You can return the answer in any order.<br/>
Example 1:<br/>
Input: nums = [2,7,11,15], target = 9<br/>
Output: [0,1]<br/>
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].<br/>
Example 2:<br/>
Input: nums = [3,2,4], target = 6<br/>
Output: [1,2]<br/>
Example 3:<br/>
Input: nums = [3,3], target = 6<br/>
Output: [0,1]<br/>
Constraints:<br/>
2 <= nums.length <= 104<br/>
-109 <= nums[i] <= 109<br/>
-109 <= target <= 109<br/>

<h2 style="font-size: 20px;">3 approaches</h2>
<h2 style="font-size: 18px;">Brute Force approach</h2>
The code you provided implements the "Two Sum" problem using a Brute Force (loop) to loop through numbers one by one. Here's an explanation of the code:
<h2 style="font-size: 13px;">Intuition</h2>
The intuition behind this code is to use a nested loop to check every pair of elements in the `nums` array to see if their sum equals the `target`.
<h2 style="font-size: 13px;">Approach</h2>
1. Initialize an empty vector `result` to store the indices of the two numbers that add up to the `target`.
2. Use two nested loops to iterate through all possible pairs of elements in the `nums` array.
3. For each pair of elements `(nums[i], nums[j])`, check if their sum equals the `target` (`nums[i] + nums[j] == target`).
4. If the sum equals the `target`, add the indices `i` and `j` to the `result` vector and return it as soon as a valid pair is found.
5. If no valid pair is found after both loops, return the empty `result` vector.
<h2 style="font-size: 13px;">Complexity</h2>
- Time Complexity: The code has a time complexity of O(n^2) because it uses nested loops to check all pairs of elements in the `nums` array. In the worst case, it may have to check n(n-1)/2 pairs, where n is the number of elements in the array.
- Space Complexity: The space complexity is O(1) because the `result` vector stores at most two indices, and the space required for the indices does not depend on the size of the input array.

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
The code you provided implements the "Two Sum" problem using a Two pointer. It sorts the input array, then uses two pointers to find the pair of elements that sum up to the target. Here's the breakdown of this code:
<h2 style="font-size: 13px;">Intuition</h2>
This code takes advantage of the fact that sorting the array allows us to use two pointers to efficiently find the pair of elements that add up to the target.
<h2 style="font-size: 13px;">Approach</h2>
1. Create a copy of the `nums` array called `sorted_nums` and sort it in ascending order.
2. Initialize two pointers, `left` and `right`, which point to the first and last elements of `sorted_nums`, respectively.
3. Use a while loop to iterate until `left` is less than `right`.
4. Calculate the sum of `sorted_nums[left]` and `sorted_nums[right]`.
5. If the sum is equal to the `target`, you need to find the indices of these numbers in the original unsorted array `nums`. To do this, iterate through `nums` and find the indices of `num1` and `num2`, which correspond to the values `sorted_nums[left]` and `sorted_nums[right]`. You can use `index1` and `index2` to keep track of these indices.
6. Return a vector containing `index1` and `index2`, which represent the indices of the two numbers in the original array.
7. If the sum is less than the `target`, increment `left`; if the sum is greater than the `target`, decrement `right`. This step ensures that you move the pointers closer together to find the pair.
8. If no pair is found in the loop, return an empty vector to indicate that there is no solution.
<h2 style="font-size: 13px;">Complexity</h2>
- Time Complexity: The time complexity of this code is O(n log n) due to the sorting step (where n is the number of elements in `nums`). The while loop runs in O(n) time.
- Space Complexity: The space complexity is O(n) because of the `sorted_nums` array, and the additional space used for the indices and result vector is also O(n).

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
The code you provided implements the "Two Sum" problem using a hash map (unordered_map) to store previously seen numbers and their indices. Here's an explanation of the code:
<h2 style="font-size: 13px;">Intuition</h2>
The problem requires finding two numbers in the given `nums` array that add up to the `target` value. 
<h2 style="font-size: 13px;">Approach</h2>
1. Create an unordered_map `m` to store the numbers encountered so far as keys and their indices as values.
2. Initialize an empty vector `ans` to store the indices of the two numbers that sum up to the `target`.
3. Iterate through the `nums` array from left to right using a for loop.
4. For each element `nums[i]`, calculate the complement `comp` by subtracting it from the `target` (i.e., `comp = target - nums[i]`).
5. Check if the complement `comp` exists in the unordered_map `m` by using `m.find(comp)`.
6. If the complement `comp` is found in `m`, it means we have already encountered a number earlier in the array whose complement is `comp`. In this case, we found the pair of numbers that add up to the `target`, so we add their indices to the `ans` vector and break out of the loop.
7. If the complement `comp` is not found in `m`, we insert the current number `nums[i]` into the unordered_map `m` with its index as the value.
8. Finally, return the `ans` vector, which contains the indices of the two numbers that sum up to the `target`.
<h2 style="font-size: 13px;">Complexity</h2>
- Time Complexity: The code has a time complexity of O(n) because it iterates through the `nums` array once, where n is the number of elements in the array.
- Space Complexity: The space complexity is O(n) because, in the worst case, all n elements of the array are stored in the unordered_map `m`.

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

K.