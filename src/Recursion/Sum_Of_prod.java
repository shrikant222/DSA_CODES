package Recursion;

public class Sum_Of_prod {
    static int sum(int n){
    if(n%10==n) return n;
    return  (n%10)*sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }
}
