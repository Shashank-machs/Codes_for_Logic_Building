public class Max_sub_Array_sum {
    public static int meth(int[]a){
       /* int n=a.length;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for (int j = i; j <n ; j++) {
                sum=sum+a[j];
                large=Math.max(sum,large);
            }
        }
        return large;

        */

        int n=a.length;
        int large=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++) {
            sum+=a[i];
            if(sum<0){
                sum=0;
        }
            if(sum > large){
                large=sum;
            }

        }
        return large;






    }

    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};

       System.out.println(meth(a));
    }
}
