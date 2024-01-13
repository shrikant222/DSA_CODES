package WrapperClass;

public class Example1 {



        public static void main(String args[]){
//Converting Integer to int
            Integer a=new Integer(10);

            int i=a.intValue();//converting Integer to int explicitly
            int j=a;//unboxing, now compiler will write a.intValue() internally

            System.out.println(a+" "+i+" "+j);
        }}