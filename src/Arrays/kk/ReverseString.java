package Arrays.kk;
import java.util.Scanner;
public class ReverseString {



    //less efficient as every time new string object being created in sting pool
    public String rev(String orgi){
        String rev="";

        for(int i=orgi.length()-1;i>=0; i--){
            rev=rev+orgi.charAt(i);
        }
        return rev;
    }


    //more efficent
     String rev1(String ori){
        StringBuilder rev = new StringBuilder();
        for (int i =ori.length()-1; i>=0 ; i--) {
            rev.append(ori.charAt(i));
        }

        return rev.toString();
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        ReverseString o = new ReverseString();
        System.out.println(o.rev1(str));

    }
}
