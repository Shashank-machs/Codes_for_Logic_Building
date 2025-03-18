import java.sql.SQLOutput;

/*
Given an array of n elements, and two integers say x and y, present in the array, find out the minimum distance between x and y in the array, that is the number of elements between x and y, including y. If the elements are not present print infinite value.

        Example:
ArrayOne = [1, 2, 3, 4, 5, 6]
x = 2
y = 5
Output
3



public class distance_bw_2_num {
    public static int meth(int[] a, int x, int y) {
        int n = a.length;
        int pos = -1, pos2 = 0;
        int dist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] == x || a[i] == y) {
                if (pos != -1 && a[i] != a[pos]) {
                    dist = Math.min(dist, i - pos);
                }
                pos = i;
            }
        }

        return  dist;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int res = meth(arr, 2, 5);
        System.out.println(res);
    }


}

 */
public class distance_bw_2_num {
    public static int meth(int[] a, int x, int y){
        int n=a.length;
        int pos=0,pos2=0;
        int dist=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]==x ||a[i]==y){
                pos=i;
                break;
            }
        }
        for (int i = pos+1; i < n; i++) {
            if(a[i]==x||a[i]==y) {


                dist = Math.min(dist, i - pos);
            }
            }
            return dist;
        }

        public static void main(String[] args) {
            int [] arr={1, 2, 3, 4, 6,4,5};
            System.out.println(meth(arr,2,5));
        }
    }


