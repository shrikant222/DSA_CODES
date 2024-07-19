package Recursion.Arrays;

import java.util.Arrays;






     class AA {
        public static void main(String[] args) {
            int []arr={1,4,5,3,2};
            ff(1,4,arr,1);
            System.out.println(Arrays.toString(arr));

        }


        public static void ff(int col , int row,int[]arr,int i) {
            if (row < 1) return;
            if (col != 0) {
                if (arr[col] < arr[col - 1]) {
                    int temp = arr[col];
                    arr[col] = arr[col - 1];
                    arr[col - 1] = temp;
                    ff(col - 1, row, arr, i);
                } else ff(0, row-1, arr, i+1);

            } else {
                ff(i + 1, row - 1, arr, i + 1);
            }
        }
}
