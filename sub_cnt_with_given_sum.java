/*
  Apply for ---1)Count Subarray sum Equals K
 Example 1:
Input Format:
 N = 4, array[] = {3, 1, 2, 4}, k = 6
Result:
 2
Explanation:
The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].

              2)Longest Subarray with given Sum

              Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.


 */
public class sub_cnt_with_given_sum {
    static int meth(int[] a,int t){
        int n=a.length;
       /* int start=0,end=0,temp_start=0;
        int sum=0,cnt=0;
        for (int i = 0; i < n; i++) {
            sum+=a[i];
            if(sum==t){
                cnt++;
                start=i+1;
            }
        }

        int cnt=0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j <n ; j++) {
                sum+=a[j];
                if(sum==t){
                    cnt++;
                }
            }

        }
        return cnt;

        */
        int maxlen=0,start=0,end=-1,sum=0,cnt=0;
        while(start<n){
            while((end+1<n)&&(sum+a[end+1]<=t)){
                sum+=a[end+1];
                end++;

            }
            if(sum==t){
                maxlen=Math.max(maxlen,end-start+1);
                cnt++;
            }
            sum-=a[start];
            start++;
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[]a={-1, 1, 1};
        int t=4;
        System.out.println(meth(a,t));
    }
}
