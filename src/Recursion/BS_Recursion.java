package Recursion;

public class BS_Recursion {

    static int BS(int []arr, int target, int start,int end){
        int mid=start+(end-start)/2;
        if (arr[mid]==target)
        return mid;
        if(mid >target)
        return BS(arr,target, start,mid-1);
        if(mid <target)
        return BS(arr,target, mid+1,end);

        return -1;
    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,7,8,9,10};
        System.out.println(BS(arr,9,0,arr.length-1));
    }
}
