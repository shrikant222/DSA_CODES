package AAATRY;
import java.util.HashSet;
 class Main
{
    static boolean isPrime(int n){
        if(n<2)return false;
        for (int i=2;i<=Math.sqrt(n) ;i++ ) {
            if(n%i==0)return false;
        }
        return true;
    }

    static void fun(int n){
        HashSet<Integer> hm = new HashSet<>();
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                if(hm.contains(n-i)){
                    System.out.println(n-i+" "+i);
                    return;
                }
                else{
                    hm.add(i);
                }
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        fun(74);
    }

}