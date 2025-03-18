public class left_rotate_array {
    static void meth(int []a,int k){
        int n=a.length;
        int []temp=new int[k];
        for (int i = n-k; i < n; i++) {
            temp[i-n+k]=a[i];
        }
        for(int i=n-k-1;i>=0;i--){
            a[i+k]=a[i];
        }
        for (int i = 0; i < k; i++) {
            a[i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        meth(a,3);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
