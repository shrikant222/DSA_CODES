package AAATRY;

/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

 class Ma
{

    static boolean isprime(int n){
        if(n<2)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return false;
        }
        return true;
    }

    static void fact(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0 && isprime(i)){
                System.out.println(i);
            }
        }
        if(isprime(n))
            System.out.println(n);
    }


    public static void main(String[] args) {
        fact(60);
    }
}