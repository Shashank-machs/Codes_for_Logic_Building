import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Alternate_Positive_Negetive {
    public static int[] meth(int []a){
        int n=a.length;
        Queue<Integer> plist=new LinkedList<>();
        Queue<Integer>Nlist=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if(a[i]>0){
                plist.add(a[i]);
            }
            if(a[i]<0){
                Nlist.add(a[i]);
            }
        }
        int i=0;
        while(i<n){
                if(plist.size()>0) {
                    a[i] = plist.poll();
                    i++;
                }
            if(Nlist.size()>0) {
                a[i] = Nlist.poll();
                i++;
            }
        }


    return a;
    }

    public static void main(String[] args) {
        int[] a={1,2,-3,4,-5,-6,-7};
        int []arr=meth(a);
        for(int var:arr){
            System.out.print(var+" ");
        }
    }
}
