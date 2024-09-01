package BIG.INTEGER;

import java.math.BigInteger;

public class one {
    public static void main(String[] args) throws InterruptedException {
        int a = 10;
        BigInteger A = new BigInteger("111");
        BigInteger b = BigInteger.valueOf(a);
        BigInteger C = A.add(b);
        System.out.println(fact(10000));

    }

    static BigInteger fact(int num) {
        BigInteger ans = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));


        }
        return ans;
    }
}
