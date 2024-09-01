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
    public static int countNegatives(int[][] grid) {
        int row=0;
        int col=grid.length-1;
        int count=0;
        while(row<grid.length&&col>=0){
            if(grid[row][col]<0){
               count+=(grid.length-row);
               col--;
            } else if (0<=grid[row][col]) {
                row++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][]arr={
                {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}

        };
//        System.out.println(arr[0].length);
        System.out.println(countNegatives(arr));
//        System.out.println(Arrays.toString(_2D(arr,60)));
    }
}