package Arrays.kk;

import java.util.Arrays;

public class EOFA1 {

 
    public static void main(String[] args) {
        int [] [] arr= {
                {1,2,3},
                {4,5,6,10},
                {7,8,9}};
        for(int []a:arr) {
            for(int b: a){
                System.out.print(b+" ");
            }
            System.out.println();
//            System.out.println(Arrays.toString(a));
        }


        for (int[] value : arr) {
            System.out.println(Arrays.toString(value));

        }

        for (int[] ints : arr) {//rows
          for(int a:ints) {
              System.out.println(a);
          }
        }
    }
}
