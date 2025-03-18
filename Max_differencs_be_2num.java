//This is a Java Program to Find 2 Elements in the Array such that Difference between them is Largest.
/*Enter no. of elements you want in array:7
Enter all the elements:
-2
4
5
6
2
7
-3
Greatest Difference:10




public class Max_differencs_be_2num {
    public static int meth(int[] a){
        int n=a.length;
        int diff=0;
        for (int i = 0; i < n; i++) {
            for (int j =i+1; j <n; j++) {
                if(a[i]-a[j]>diff){
                    diff=Math.max(diff,a[i]-a[j]);

                }
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int []arr={-2,4,5,6,2,7,-3};
        System.out.println(meth(arr));
    }

}

 */

public class Max_differencs_be_2num {
    public static int meth(int[] a){
        int n=a.length;
       int diff=Integer.MIN_VALUE;
         int max_dif=0;
         int start=0,end=0;

        for (int i = 1; i < n; i++) {
            max_dif=a[start]-a[i];
            if(max_dif>diff){
                diff=max_dif;

            }

        }
        return diff;
    }

    public static void main(String[] args) {
        int []arr={-2,4,5,6,2,7,-3};
        System.out.println(meth(arr));
    }

}





