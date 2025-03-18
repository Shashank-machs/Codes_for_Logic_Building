import java.util.*;

class reverse_Sentence {
    static String meth(String s){
        s.trim();
        String [] str=s.split(" ");
        StringBuffer sb=new StringBuffer();
        for (int i =str.length-1; i>=0; i--) {
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="Hii meghana how do you do";
        System.out.println( meth(s));
    }
}

