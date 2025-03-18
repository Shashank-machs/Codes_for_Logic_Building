
/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.



Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */
import java.util.*;
public class sort_0_1s {
    public static void sortColors(int[] n) {
       // ArrayList<Integer> list=new ArrayList<>();
        int cnt0=0,cnt1=0,cnt2=0;

        for(int i=0;i<n.length;i++){
            if(n[i]==0){
                cnt0++;
            }
            else if(n[i]==1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        for(int i=0;i<cnt0;i++){
            n[i]=0;
        }
        for(int i=cnt0;i<cnt1+cnt0;i++){
            n[i]=1;
        }
        for(int i=cnt0+cnt1;i<n.length;i++){
            n[i]=2;
        }
       // System.out.println(cnt2+"hii");

    }

    public static void main(String[] args) {
        int []a={2,0,2,1,1,0};
        sortColors(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
    }
}
