package BInarySreachQutions;

import java.util.Arrays;

public class TWO_D_BS {
    //sorted in row and column wise manner
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,9,11,12},

        };
            System.out.println(Arrays.toString(TwoBS(arr,3)));
    }
    public static int[] TwoBS(int[][] arr, int target){
        int row = 0;
        int col= arr[0].length-1;
        while(row<arr.length&& col>=0){
        if(arr[row][col]==target){
            return new int[]{row,col};
        }
        if (arr[row][col]<target) {
            row++;
        }
        else  {
            col--;
        }

        }
        return new int[]{-1,-1};
    }
}
