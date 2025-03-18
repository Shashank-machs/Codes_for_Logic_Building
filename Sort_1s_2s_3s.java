public class Sort_1s_2s_3s {

    public static int[] meth(int[]a){
        int n=a.length;
        int max=a[0];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[j]<max){
                    int temp=a[j];
                    a[j]=max;
                    max=temp;
                }
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int[]a={2,0,2,1,1,0};
        int arr[]=meth(a);
        for(int var:arr){
            System.out.println(var);
        }
    }
}
