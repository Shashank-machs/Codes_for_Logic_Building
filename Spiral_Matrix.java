import java.util.ArrayList;
public class Spiral_Matrix {
    public static ArrayList<Integer> meth(int [][]a){
        int n=a.length; //num of rows
        int m=a[0].length; //num of cols

        ArrayList<Integer>list =new ArrayList<Integer>();

        int top=0,left=0,right=m-1,btm=n-1;

        while(top<=btm && left<=right){

            //to print left to right
            for (int i = left; i <=right; i++) {
                list.add(a[top][i]);
            }
            top++;

            //to print top to btm
            for (int i = top; i <=btm; i++) {
                list.add(a[i][right]);
            }
            right--;

            if(top<=btm) {
                //right to left
                for (int i = right; i >= left; i--) {
                    list.add(a[btm][i]);
                }
                btm--;
            }

                if(left<=right){
                    //btm to top
                    for (int i =btm; i >=top; i--) {
                        list.add(a[i][left]);
                    }
                    left++;
                }

        }
        return list;
    }

    public static void main(String[] args) {
        int [][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        ArrayList<Integer> list=meth(a);
        for(int var:list){
            System.out.println(var+" ");
        }
    }
}
