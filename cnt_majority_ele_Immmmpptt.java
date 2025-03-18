import java.util.HashMap;

//cnt majority elemente half of the size of array
/*public class cnt_majority_ele {
    public static int meth(int[]a){
        int cnt=0,n=a.length;
        int ele=0;

        for (int i = 0; i < n; i++) {
           if(cnt==0){
               cnt=1;
               ele=a[i];
           }
           else if(ele==a[i]){
               cnt++;
           }
           else{
               cnt--;
           }

        }
        int cnt1=0;
        for (int i = 0; i <n ; i++) {
            if(a[i]==ele){
                cnt1++;
            }
            if(cnt1>n/2){
                return ele;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]a={2,3,4,2,2,3,4,2,2,2};
       int x= meth(a);
        System.out.println(x);
    }
}

 */

public class cnt_majority_ele_Immmmpptt {
    static int meth(int []a){
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        int n=a.length;

        for (int i = 0; i <n ; i++) {

          int value=map.getOrDefault(a[i],0);
          map.put(a[i],value+1);
            }
      /*  for(HashMap.Entry<Integer,Integer> var:map.entrySet()){
            if(var.getValue()>n/2){
                return var.getKey();

            }
       */

        /*
        for (var entry : map.entrySet()) {
           if (entry.getValue() > n / 2) {
               return entry.getKey();
            }
          }

          for(Integer key:map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
         }

         */
        for(HashMap.Entry<Integer,Integer> var:map.entrySet()) {
            if (var.getValue() > n / 2) {
               // System.out.println(var.getKey());
                return var.getKey();

            }
        }



        return -1;
    }
    public static void main(String[] args) {
        int[]a={2,3,4,2,2,3,4,2,2,2};
        int x= meth(a);
        System.out.println(x);
    }
}