package TWODARRAYS;

import java.util.Arrays;

public class BS {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 7)));
    }
    public static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        int Rstart = 0, Rend = cols - 1;
        int midcol=cols/2;
        if (rows == 1) {
            return BSearch(arr,0, 0, cols-1, target);
        }
        while(Rstart <Rend-1) {
            int mid=Rstart + (Rend - Rstart)/2;
            if(arr[midcol][mid] == target) {
                return new int[]{mid, midcol};
            } else if (arr[midcol][mid] > target) {
                Rend=mid;

            }else{
                Rstart=mid;
            }
        }
        if(arr[Rstart][0]<=target&&arr[Rstart][cols-1]>=target) {
            return BSearch(arr,Rstart,0,cols-1,target);
        }
        else{
            return BSearch(arr,Rend,0,cols-1,target);
        }



    }
    public static int[] BSearch(int[][] arr, int row,int cstart,int cend, int target) {
        while(cstart<=cend) {
            int mid=(cend+cstart)/2;
            if(arr[row][mid] == target) {
                return new int[]{row, mid};
            } else if (arr[row][mid] > target) {
                cend = mid-1;

            }else {
                cstart = mid+1;
            }
        }
        return new int[]{-1, -1};
    }
}
