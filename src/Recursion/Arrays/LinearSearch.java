package Recursion.Arrays;

public class LinearSearch {
    //from front
    public static int search(int[]arr,int taget){
         return helper(arr,0, taget);
    }

    public static int helper(int[]arr, int index,int target){
        if(index==arr.length) return -1;
        if(arr[index]==target) return index;
        else return helper(arr,index+1,target);
    }

    public static void main(String[] args)
    {
        int []arr={3,2,1,5,8,8,1,8,7};
        System.out.println(search(arr,8));
        System.out.println(search_Back(arr,8));
    }



    // from back
    public static int search_Back(int[]arr,int taget){
        return helperB(arr,arr.length-1, taget);
    }

    public static int helperB(int[]arr, int index,int target){
        if(index==-1) return -1;
        if(arr[index]==target) return index;
        else return helperB(arr,index-1,target);
    }

}
