package TWODARRAYS;

import java.util.Arrays;

class TWOD{
    public static int[] _2D(int[][]arr, int target){
        int row=0;
        int col=arr.length-1;

        while(row<arr.length&&col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            } else if (target<arr[row][col]) {
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][]arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {40,50,60,70}
        };
        System.out.println(Arrays.toString(_2D(arr,60)));
    }
}