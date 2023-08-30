package Recursion;

public class example {
    static void print1(int n){
        if(n==10) return;
        print1(n+1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        print1(5);
    }


}
