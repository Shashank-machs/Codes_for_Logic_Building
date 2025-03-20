import java.util.HashMap;

/*
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
Only one valid answer exists.

 */
public class two_sum_HashMap {
    public static int[] twoSum(int[] n, int t) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n.length; i++) {

            int compt = t - n[i];
            if (map.containsKey(compt)) {
                return new int[]{map.get(compt), i};
            }
            map.put(n[i], i);

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 9, 11, 15, 7};
        int target = 9;
        int[] result = twoSum(nums, target);

        // Print result
        System.out.println("[" + result[0] + ", " + result[1] + "]");


    }
}
