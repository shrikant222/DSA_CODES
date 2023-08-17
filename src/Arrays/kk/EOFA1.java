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


        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }

        for (int i = 0; i <arr.length ; i++) {//rows
            for (int j = 0; j <arr[i].length ; j++) {//column
                System.out.print(arr[i][j]);

            }
            System.out.println();

        }
    }
}
