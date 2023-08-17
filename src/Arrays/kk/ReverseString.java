package Arrays.kk;
import java.util.Scanner;
public class ReverseString {


    public String rev(String orgi){
        String rev="";

        for(int i=orgi.length()-1;i>=0; i--){
            rev=rev+orgi.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
        ReverseString o = new ReverseString();
        System.out.println(o.rev(str));

    }
}
