package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {


    static void sortO(int []arr){
        sort(arr,arr.length-1,0,0);
    }
    static void sort(int[] arr, int row, int col,int max) {
        if(row==0) return;

        if(col<row)
        {
            if( arr[col+1]>arr[max]){
                sort(arr,row,col+1,col+1);
            }
            else {
                sort(arr, row, col + 1, max);
            }
        }

        else
        {
            int temp=arr[max];
            arr[max]=arr[row];
            arr[row]=temp;
            sort(arr,row-1,0,0);
        }


    }

    public static void main(String[] args) {
        int[]arr={5,1,4,3,2};
        sortO(arr);
        System.out.println(Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char b=sc.next().charAt(0);
        String c=sc.nextLine();
        sc.close();
    }



    //max
//    static void sortO(int []arr){
//        sort(arr,arr.length-1,0,0);
//    }
//    static void sort(int[] arr, int row, int col,int max) {
//        if(row==0) return;
//
//        if(col<row)
//        {
//            if( arr[col+1]>arr[max]){
//                max= (col+1);
//            }
//            sort(arr,row,col+1,max);
//        }
//
//        else
//        {
//            int temp=arr[max];
//            arr[max]=arr[col];
//            arr[col]=temp;
//            sort(arr,row-1,0,0);
//        }
//
//
//    }


}
