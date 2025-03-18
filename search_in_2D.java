public class search_in_2D {
    public static boolean meth(int[][] a,int t){
        int n=a.length;
        int m=a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j]==t){
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(meth(a,8));
    }
}
