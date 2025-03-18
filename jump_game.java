public class jump_game {
    static boolean meth(int[] a){
        int n=a.length;
        int i=0;

        while(i<=n){
            if(i==n){
                return true;
            }
            else if(a[i]+i<n){
                i=i+a[i];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int []a={2,3,1,1,4};
        meth(a);
        System.out.println(meth(a));
    }
}
