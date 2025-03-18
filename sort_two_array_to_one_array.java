public class sort_two_array_to_one_array {
    public static void main(String[] args) {

      /* 88
       int []a={1,2,3,0,0,0};

        int []b={2,5,6};
        int m=a.length;
        int n=b.length;
        int i=m-n-1,j=n-1,k=m-1;
        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                a[k]=a[i];
                i--;
            }
            else{
                a[k]=b[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            a[k]=a[j];
            j--;
            k--;
        }
        for( i=0;i<a.length;i++){
            System.out.print(a[i]+" " );
        }

       28
        int a[]={1,2,2,3,4,5,2};
        int x=2;
        int index=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=x){
                a[index]=a[i];
                index++;
            }
        }
        System.out.println(index);
        */
        int a[]={0,0,1,1,1,2,2,3,3,4};
        int j=1;

        for (int i = 1; i < a.length; i++) {
            if(a[i]!=a[i-1]){
                a[j]=a[i];
                j++;
            }


        }
        System.out.println(j);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }

}
