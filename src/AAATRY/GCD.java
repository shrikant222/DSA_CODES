package AAATRY;

/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/

 class GCD
{
    static int GCD(int n, int m){
        int dif=Math.abs(n-m);
        if(n%dif==0 && m%dif==0)return dif;
        for(int i=dif/2;i>0;i--){
            if(n%i==0 && m%i==0)return i;
        }
        return -1;
    }
    static int LCM(int n, int m){
        int max=Math.max(n,m);
        if(max%n==0 && max%m==0)return max;
        for(int i=1;i<max;i++){
            int ii=max*i;
            if(ii%n==0 && ii%m==0)return ii;
        }
        return -1;
    }
    static int LCM1(int n, int m) {
        int max = Math.max(n, m);
        int lcm = max;
        while (true) {
            if (lcm % n == 0 && lcm % m == 0) {
                return lcm;
            }
            lcm += max;
        }
    }
    public static void main(String[] args) {
        System.out.println(3/4 + 1/7);
    }
}
