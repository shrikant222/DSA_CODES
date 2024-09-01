package Recursion;

public class Rev_num {
    static int rev=0;
    static int rev1(int n){
        if(n<=0) return n ;
        rev=rev*10+(n%10);
        return rev1(n/10);
    }
    static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        System.out.println(digits);
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n) return n;
        int rem=n%10;
        return rem * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }


    public static void main(String[] args) {
        System.out.println(rev1(123));
        System.out.println(rev);

       }

    static int nor_rev(int n) {
        int num = 12345;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        return rev;
    }
}
