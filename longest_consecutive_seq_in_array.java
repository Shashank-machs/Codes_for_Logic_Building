/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 */

import java.util.*;
public class longest_consecutive_seq_in_array {
    static boolean search(int []a,int num){
        int n=a.length;
        for (int i = 0; i < n; i++) {

            if(a[i]==num){
                return true;
            }

        }
        return false;
    }
    static int meth(int[] a){
        int n=a.length;
        int longest=1;
        for (int i = 0; i <n ; i++) {
            int cnt=1;
            int x=a[i];
            while(search(a,x+1)==true){
                cnt++;
                x+=1;
            }
            longest=Math.max(longest,cnt);

        }
        return longest;
    }

    //2nd approach
    public static int meth2(int []a) {
        int n = a.length;
        if (n == 0) return 0;

        //sort the array:
        Arrays.sort(a);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        //find longest sequence:
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == lastSmaller) {
                //a[i] is the next element of the
                //current sequence.
                cnt += 1;
                lastSmaller = a[i];
            } else if (a[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = a[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static int meth3(int []a){
        Set<Integer> set=new HashSet<>();
        int longest=1;
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        if(set.isEmpty()){
            return 0;
        }
        for(int var:set){
            if(!set.contains(var-1)) {
                int cnt=1;
                int x=var;
                while (set.contains(x+1)){
                    cnt+=1;
                    x+=1;

                }
                longest=Math.max(cnt,longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[]a={3, 8, 5, 7, 6,9,10,12};
        System.out.println(meth3(a));
    }
}
