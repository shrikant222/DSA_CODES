package StringBuffer;


import java.io.BufferedReader;
import java.util.Random;

class Random1 {
    public static void main(String[] args) {
        Random rand = new Random();
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            int val = rand.nextInt(95, 123);
            char ch = (char) (val);
            bf.append(ch);
        }

        System.out.println(bf);
    }
}
