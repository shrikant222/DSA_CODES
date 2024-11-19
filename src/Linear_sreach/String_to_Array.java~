package Linear_sreach;

import java.util.Arrays;

public class String_to_Array {
    public static void main(String[] args) {
        int [][]arr=
                {{2,3,4},
                  {2,4,10},
                        {10,22,33}

                };

      String str= Arrays.stream(arr).toString();
        System.out.println(str);
    }


    static int[] ret(int[][]arr, int target){
        for(int i=0; i< arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
