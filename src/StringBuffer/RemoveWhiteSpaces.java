package StringBuffer;

import java.util.Arrays;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String ss = "ss hello ss hh" ;
        System.out.println(ss.replace(" ",""));
        System.out.println(ss);

        String [] sarr=ss.split(" ");
        System.out.println(Arrays.toString(sarr));
    }
}
