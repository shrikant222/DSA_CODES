package BInarySreachQutions;

import java.util.Arrays;

public class TWOD_SORTED_BS {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}

        };
        System.out.println(Arrays.toString(search(arr,20)));
    }
    public static int[] search(int [][]arr, int target){
    int row = arr.length-1;
    int col=0;
    while (row>=0&&col<arr[0].length){
        if(arr[row][col]==target){
            return new int[]{row,col};
        }
        if(arr[row][col]<target){
          return binary(arr,target,row,0,arr[row].length);
        }
        else{
            row--;
        }
    }return new int[]{-1,-1};
    }

//    public static int[] search(int [][]arr, int target){
//        int row = arr.length;
//        int col=arr[0].length;
//        if(row==1){
//           return binary(arr,target,0,0,col-1);
//        }
//        int rStart=0, rEnd=row-1;
//        int cMid=col/2;
//        //run the loop till 2 rows are reamaining
//        while (rStart<(rEnd-1)){//while this is true it will have more than two rows
//            int mid=rStart+(rEnd-rStart)/2;
//
//            if(arr[mid][cMid]==target){
//                return new int[]{mid, cMid};
//            }
//            if(arr[mid][cMid]<target){
//                rStart=mid;
//            }
//            else{
//                rEnd=mid;
//            }
//
//        }
//        //now we have two rows
//        // check whaether the target is in the col of 2 rows
//        if(arr[rStart][rEnd]==target){
//            return new int[]{rStart, rEnd};
//        }
//        if(arr[rStart+1][rEnd]==target){
//            return new int[]{rStart+1, rEnd};
//        }
//        // search in 1st half
//        if(arr[rStart][cMid-1]>=target) {
//           return binary(arr, target, rStart, 0,cMid-1 );
//        }
//        // search in 2nd half
//        if(arr[rStart][cMid+1]<=target) {
//           return binary(arr, target, rStart, cMid+1, col-1);
//        }
//        // search in 3rd half
//        if(arr[rStart+1][cMid-1]>=target) {
//          return   binary(arr, target, rStart+1, 0,cMid-1 );
//        }
//        // search in 4th half
//        if(arr[rStart+1][cMid+1]<=target) {
//           return binary(arr, target, rStart+1, cMid+1,col-1 );
//        }
//
//
//
//    return new int[]{-1,-1};}

    public static int[] binary(int[][]arr,int target, int row, int cStart, int cEnd){
        while(cStart<=cEnd){
            int mid = cStart+(cEnd -cStart)/2;
            if(arr[row][mid]>target){
                cEnd =mid-1;
            }
            else if (arr[row][mid]<target) {
                cStart =mid+1;
            }

            else{
                return new int[]{row,mid};
            }
        }
        return new int[]{-1,-1};
    }
}
