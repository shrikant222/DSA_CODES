package AAATRY;

import java.util.Random;
import java.util.Scanner;
//Generate random number and find it by using BS.
class A {
    public static long ra( long min, long max){
        Random r = new Random();
        long rnum = r.nextLong(min, max);
        System.out.println(rnum);
        return rnum;
    }
    public static int rand(long num, long min, long max,long rnum) {
        if (num == rnum) return 0;
        if (num < rnum) return -1;
        else return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min and max");
        long min = sc.nextInt();
        long max = sc.nextLong();
     long rnum =ra(min,max);
        int count=0;
        long i = (min + max) / 2;
        while (rand(i, min, max,rnum) != 0) {
            count++;
            i = (min + max) / 2;
            if (rand(i, min, max,rnum) == -1) min = i+1;
            else max = i-1;


        }
        System.out.println("count=="+count);
        System.out.println(i);

    }
}


