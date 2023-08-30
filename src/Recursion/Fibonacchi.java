package Recursion;

public class Fibonacchi {

    public static int febo(int n){
    if (n==0) return 0;
    if (n==1) return 1;
    return   febo(n-1) + febo(n-2);
    }
    public static void main(String[] args) {

        System.out.print(febo(50)+" ");
        }

}
