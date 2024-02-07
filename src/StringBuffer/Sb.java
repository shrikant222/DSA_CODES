package StringBuffer;

public class Sb {


    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer(30);
        StringBuffer sb2=new StringBuffer("hello");
        System.out.println(sb.capacity());
        sb2.append(" moto");
        sb2.replace(1,3,"more");

        String s=sb2.toString();
        System.out.println(s);
        System.out.println(sb2.capacity());
    }
}
