package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[]arr, int row, int col){
        if(row==0) return;

        if(col<row)
        {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            sort(arr, row, col+1);

        }
        else {
                sort(arr, row - 1, 0);
            }

    }



    public static void main(String[] args) {
        int[]arr={5,1,4,3,2};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
