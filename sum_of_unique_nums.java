import java.util.HashSet;
import java.util.TreeSet;

public class sum_of_unique_nums {
    static int meth(int a[]){
        TreeSet<Integer> map=new TreeSet<>();
       // HashSet<Integer> map=new HashSet<Integer>();
        int sum=0;
        for(int var:a){
            map.add(var);
        }
        for(Integer k:map){
            sum+=k;
        }
        return sum;

    }
    public static void main(String[] args) {
        int[]a={2,3,4,2,2,3,4,2,2,2};
        int x= meth(a);
        System.out.println(x);
    }
}
