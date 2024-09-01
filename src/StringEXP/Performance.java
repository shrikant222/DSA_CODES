package StringEXP;

public class Performance {
    public static void main(String[] args) {
        String ser= " ";
        for (int i = 0; i <26 ; i++) {
            char ch =(char)('a'+i);
            ser=  ( ser+ch);

        }
        System.out.println(ser);
        //" "+a;
        //a+b;
        //ab+c
        //new object is being created every time.
    }
}
