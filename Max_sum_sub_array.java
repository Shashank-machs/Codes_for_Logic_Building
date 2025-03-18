
public class Max_sum_sub_array{
    public static void meth(int[]a){
        int n=a.length;
        int max_sum=Integer.MIN_VALUE;
        int cur_sum=0;
        int start=0,end=0,temp_start=0;

        for(int i=0;i<n;i++){
           cur_sum+=a[i];
            start=temp_start;
           if(cur_sum>max_sum){
               max_sum=cur_sum;
               end=i;
            }
           if(cur_sum<0){
               cur_sum=0;
               temp_start=i+1;
           }

        }
        for (int i = start; i<= end; i++) {
            System.out.print(a[i]+" ");

        }
    }

    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        meth(a);
    }
}

