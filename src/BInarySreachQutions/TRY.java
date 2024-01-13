package BInarySreachQutions;


import java.util.Arrays;

class TRY {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5},
                {5,6,7,8,9,10},
                {9,9,11,12},

        };
        System.out.println(Arrays.toString(Two(arr,9)));
    }
    public static int[] Two(int[][]arr, int target){
        for (int i = arr.length-1; i >=0; i--) {
            for (int j = arr[i].length -1; j >=0; j--) {
              if(arr[i][j]==target){
                  return new int []{i, j};

              }
            }

        }



        return new int[]{-1,-1};
    }


}
