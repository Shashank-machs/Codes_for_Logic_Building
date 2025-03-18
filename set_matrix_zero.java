/*
Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix.

Examples
Examples 1:
Input:
 matrix=[[1,1,1],[1,0,1],[1,1,1]]

Output:
 [[1,0,1],[0,0,0],[1,0,1]]

Explanation:
 Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.

Input:
 matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]

Output:
[[0,0,0,0],[0,4,5,0],[0,3,1,0]]

Explanation:
Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0

 */
public class set_matrix_zero {
    static void meth(int[][]a){
        int n=a.length;
        int m=a[0].length;
        int [][]a2=new int[n][m];
        int c=0,b=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a2[i][j]=a[i][j];

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {

                if(a[i][j]==0){
                    for (int k = 0; k < m; k++) {
                        a2[i][k]=0;

                    }
                    for (int k = 0; k <n ; k++) {
                        a2[k][j]=0;

                    }
                }

            }

        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=a2[i][j];

            }

        }

    }

    public static void main(String[] args) {
        int[][]a={{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        meth(a);
        int n=a.length;
        int m=a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]);

            }
            System.out.println();

        }
    }
}
