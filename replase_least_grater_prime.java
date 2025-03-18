public class replase_least_grater_prime {
    public static int[] meth(int [] a) {
        int n = a.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int least=Integer.MAX_VALUE;
            for (int j = i+1; j < n; j++) {
                if (a[j] > a[i] && isPrime(a[j])) {

                    least = Math.min(least, a[j]);
                }
            }
            if(least== Integer.MAX_VALUE){
                result[i]=-1;
            }
            else {
                result[i]=least;
            }

        }
        return result;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int []a={8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
        int []ab=meth(a);
        for(int var:ab){
            System.out.println(var);
        }
    }
}
