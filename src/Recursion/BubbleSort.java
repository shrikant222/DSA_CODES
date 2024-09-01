package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[]arr, int last, int first){
        if(last==0) return;

       if(first<last)

        {
            if (arr[first] > arr[first + 1]) {
                int temp = arr[first];
                arr[first] = arr[first + 1];
                arr[first + 1] = temp;
            }
            sort(arr, last, first+1);

        }
        else {
                sort(arr, last - 1, 0);
            }

    }



    public static void main(String[] args) {
        int[]arr={5,1,4,3,2};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
