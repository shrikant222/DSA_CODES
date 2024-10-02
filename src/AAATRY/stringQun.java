package AAATRY;

import java.util.Scanner;

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

    public static boolean pali(int i, String str) {
    if(i>str.length()/2){
        return true;
    }
    if(str.charAt(i)==str.charAt(str.length()-1-i)){
        return pali(i+1,str);
    }
    return false;
    }


    public static void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter char");
        String st = sc.nextLine();
        String ans = "";
        int sum = 0;
        for (int i = 0; i < st.length(); i++) {

            if ((st.charAt(i) >= '0') && (st.charAt(i) <= '9')) {
                while (i<st.length()&& (st.charAt(i) >= '0') && (st.charAt(i) <= '9')) {
                    ans = ans + st.charAt(i);
                    i++;
                }
                int temp = Integer.parseInt(ans);
                sum += temp;
                ans = "";
            }


        }
        System.out.println(sum);
    }


            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter char");
                String str=sc.nextLine();
                str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                str = str.substring(0,str.length()-1)+ Character.toUpperCase(str.charAt(str.length()-1)) ;
                for(int i=1;i<str.length()-1;i++){
                    if(str.charAt(i)==' '){
                        str=str.substring(0,i-1)+Character.toUpperCase(str.charAt(i-1))+str.substring(i);
                        str=str.substring(0,i+1)+Character.toUpperCase(str.charAt(i+1))+str.substring(i+1);
                    }
                }

                System.out.println(str);


        }

}
