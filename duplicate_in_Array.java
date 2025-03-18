import java.lang.reflect.Array;
import java.util.ArrayList;

public class duplicate_in_Array {
    public static int meth(int[]a) {
       /* int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]==a[i]){
                    return a[j];
                }
            }
        }
        return 0;
    }

        */
       // int n = a.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int var:a) {
            if (list.contains(var)){
                return var;
            } else {
                list.add(var);
            }
        }


        return -1;
    }


    public static void main(String[] args) {
        int []a={2,3,4,5,6,3};
        System.out.println(meth(a));
    }
}
