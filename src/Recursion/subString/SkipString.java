package Recursion.subString;

public class SkipString {

    public static void main(String[] args) {

        System.out.println(   ff("aaapplell"));
    }

    public static String ff(String up){
        if(up.isEmpty())return "";

        if(up.startsWith("apple")){
            return ff(up.substring(5));
        }
        else {
            return up.charAt(0)+ff(up.substring(1));
        }
    }
}
