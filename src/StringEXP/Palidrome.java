package StringEXP;

public class Palidrome {

public static boolean pali(String str){
    if(str==null||str.length()==0){
        return true;
    }
    for (int i = 0; i <str.length()/2 ; i++) {

        str= str.toLowerCase();
        char start = str.charAt(i);
        char end  = str.charAt(str.length()-i-1);

        if(start!=end){
            return false;
        }

    }
    return true;
}
    public static void main(String[] args) {
        String str="tent";
        String str1="tenet";
        System.out.println( pali(str));

    }
}
