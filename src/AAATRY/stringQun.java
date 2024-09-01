package AAATRY;

public class stringQun {
    static boolean palindrome(String str) {
        for (int i = 0; i <=str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }

        }return true;
    }
    public static String a(String str){
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ){
                str=str.substring(0,i)+str.substring(i+1);
                i--;
            }
        }
        return str;
    }
    public static String A(String str){
        str=str.toLowerCase();
        int i=0;
       while(i<str.length()){
            if(!(str.charAt(i)>='a' && str.charAt(i)<='z')&&(str.charAt(i) !=' ')){
                str=str.substring(0,i)+str.substring(i+1);

            }else i++;
        }
        return str;
    }


 static public  String fun(String str){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>='a' && c<='z'){
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(fun("JaVa"));

    }
}
