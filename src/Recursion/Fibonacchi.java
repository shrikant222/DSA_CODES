package Recursion;

public class Fibonacchi {

    public static int febo(int n){
    if(n<=1)return n;

    return   febo(n-1) + febo(n-2);
    }
    public static int febo2(int n){
return (int) (Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(n));

    }



    public static void main(String[] args) {

        System.out.print(febo(20)+" ");
        }

}
