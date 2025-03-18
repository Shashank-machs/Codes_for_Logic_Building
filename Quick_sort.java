public class Quick_sort {
    public static int meth(int []a,int low,int high){
        int i=low,j=high;
        int pivot=a[low];

        while(i<j){
            //it stops when it finds element smaller than pivot
            while(a[i]<=pivot&&i<=high-1){
                i++;
            }
            //it stops when it finds element grater than pivot
            while(a[j]>pivot&&j>=low+1){
                j--;
            }
            //if indexes not cross each other than it will execute
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        //after finding the elem which is less and grater it will swap
        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;

        return j;

    }

    //recursive function it call by itself untill low < high
    static void sort(int[]a,int low,int high){
        if(low<high){
            int pivot=meth(a,low,high);
            sort(a,low,pivot-1);
            sort(a,pivot+1,high);

        }
    }

    public static void main(String[] args) {
        int[]a={1,2,6,8,3,9,4,6};
        sort(a,0,a.length-1);
        for(int var:a){
            System.out.print(var+" ");
        }
    }
}
