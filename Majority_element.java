import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.



Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]


Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 */
public class Majority_element {
    public  static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:nums){
            if(map.get(num)>n/3){
                if(!list.contains(num)){
                    list.add(num);
                }


            }

        }
        System.out.println(map);
        return list;
    }

    public static void main(String[] args) {
int[] num={3,2,3};
        System.out.println(majorityElement(num));
    }

}
