package Recursion.Arrays;

public class Sorted_orNot {

//    public static boolean sorted(int[]arr,int index){
//        if(index==arr.length-1) return true;
//        return arr[index]<arr[index+1] && sorted(arr,index+1);
//    }

    public static boolean sorted(int[]arr){
        return helper(arr,0);
    }

    public static boolean helper(int[]arr, int index){
        if(index==arr.length-1) return true;
        return arr[index]<arr[index+1] && helper(arr,index+1);
    }

    public static void main(String[] args) {
        int []arr={1,3,4,8,9};
        System.out.println(sorted(arr));
    }
}
