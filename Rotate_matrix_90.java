import java.util.ArrayList;

public class Rotate_matrix_90 {
    /*
    public static int[][] meth(int[][] a) {
        int n = a.length; //num of rows
        int m = a[0].length; //num of cols
        int[][]mat=new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                mat[j][n-i-1]=a[i][j];
               // System.out.println(mat[j][n-i-1]);
            }
        }
        return mat;

    }
     */
    public static int[][] meth(int[][] a) {
        int n = a.length; //num of rows
        int m = a[0].length; //num of cols

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][n - 1 - j];
                a[i][n - 1 - j] = temp;
            }
        }
        return a;
    }



    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
       int[][]mat= meth(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(mat[i][j]+",");
            }
            System.out.println();
        }
    }
}

