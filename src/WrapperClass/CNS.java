package WrapperClass;

import java.util.Scanner;

class CNS{
    public static StringBuffer cns(String in, int k)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<in.length(); i++)
        {
            char c=in.charAt(i);
            if (Character.isUpperCase(c))
            {
                char ch = (char)(((int)c +k - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)c +k - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
    public static void main(String[]args){
        System.out.println('A'-0);
        Scanner sc = new Scanner(System.in);
        String in= sc.nextLine();
        int k=1;

        System.out.println(cns(in, k));


    }

}
