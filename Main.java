//Best time to buy and sell Stack Ex:[7,1,5,3,6,4] ans=[1-6]=5

import java.util.*;

class Solution {
    public int maxProfit(int[] a) {

        int minP=Integer.MAX_VALUE;
        int maxP=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<minP){
                minP=a[i];
            }
            else if((a[i] - minP)>maxP){
                maxP=a[i]-minP;
            }
        }
        return maxP;
    }
}


 class Solution1 {
    public static List< List < Integer > > triplet(int n, int []arr) {
        // Write your code here.

        Set<List<Integer>> st=new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {

            Set<Integer>hashset=new HashSet<>();

            for (int j = i+1; j < arr.length; j++) {

                int third=-(arr[i]+arr[j]);

                if(hashset.contains(third)){

                    List<Integer>temp=Arrays.asList(arr[i],arr[j],third);
                    temp.sort(null);
                    st.add(temp);

                }
                hashset.add(arr[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);
        ans.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });


        return ans;

    }
}

class Main{
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        int arr[]={-18,-1,-44,-48,-9,-16,-36,-13,29,17,-12,9,-49};
        int n=13;
//        Solution obj=new Solution();
//        int res=  obj.maxProfit(a);
//        System.out.println(res);
        Solution1 obj=new Solution1();
        List<List<Integer>> list=obj.triplet(6,arr);

        for (List<Integer> it : list) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }

    }

/*peak index in a mountain array

Input: arr = [0,1,0]
Output: 1

class Solution1 {
    public int peakIndexInMountainArray(int[] a) {
        int low=0,high=a.length-1;
        while(low<high){
        int mid=(low+high)/2;
            if(a[mid]<a[mid+1]){
                low=mid+1;
            }
             else{
            high=mid;
                }
            }
        return low;
    }
}

 */