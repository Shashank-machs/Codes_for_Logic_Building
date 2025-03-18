import java.util.Arrays;

public class print_last_word {

        static String meth(String[] s){
            Arrays.sort(s);
           StringBuffer sb=new StringBuffer();

            String s1=s[0];
            String sn=s[s.length-1];
            int i=0;
            while(s1.charAt(i)==sn.charAt(i)){
                sb.append(s1.charAt(i));
                i++;
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            String [] str={"pliower","nliow","flight"};
            System.out.println(meth(str));

        }
}
