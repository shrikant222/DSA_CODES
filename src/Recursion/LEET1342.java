package Recursion;

public class LEET1342 {
    public static int numberOfSteps(int num) {
        return  helper(num,0);
    }
   static int helper(int num, int c){
        if(num<=0) return c;
        if (num%2==0) return helper(num/2,c+1);
        return helper(num-1,c+1);
    }

    public static void main(String[] args) {
        System.out.println( numberOfSteps(14));
    }
}
