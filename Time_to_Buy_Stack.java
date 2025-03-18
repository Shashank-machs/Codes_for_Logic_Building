public class Time_to_Buy_Stack {
    public static int meth(int[] a){
     /*
      int n=a.length;
        int dif=Integer.MIN_VALUE;
        int max1=0;
        for (int j = 0; j < n; j++) {

        for (int i = j+1; i < n; i++) {

            if (a[i] - a[j] > dif) {
                dif = a[i] - a[j];
            }
            max1=Math.max(max1,dif);
          }
        }
        return max1;
      */
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            minPrice = Math.min(minPrice, a[i]);
            maxPro = Math.max(maxPro, a[i] - minPrice);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        System.out.println(meth(a));
    }
}
