public class largest_sum_array {
    public static int meth(int []a){
        int n=a.length;
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum=sum+a[j];
                maxi=Math.max(maxi,sum);
            }


        }
        return maxi;


    }

    public static void main(String[] args) {
        int[]a={ -2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(meth(a));
    }
}
