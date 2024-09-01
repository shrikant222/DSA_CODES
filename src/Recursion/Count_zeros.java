package Recursion;

public class Count_zeros {

    public static int count(int n){
        return helper(n,0);
    }
    static int helper(int n , int c){
        if(n==0) return c;
        if(n%10==0) return helper(n/10,c+1);
        return helper(n/10,c);
    }

    static long zcount(long n, int c){
        if(n==0) return c;
        if(n%10==0) c=c+1;
        return zcount(n/10,c);
    }


    public static void main(String[] args) {
        System.out.println(count(36011001));
    }
}
