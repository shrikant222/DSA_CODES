package Recursion;

public class BS_Recursion {

    static int BS(int []arr, int target, int start,int end)
    {
        if (start>end) return -1;
        int mid=start+(end-start)/2;
        if (arr[mid]==target)
        return mid;
        if(arr[mid] >target)
        return BS(arr,target, start,mid-1);
        if(arr[mid] <target)
        return BS(arr,target, mid+1,end);

        return -1;
    }

    static int BS2(int []arr, int target, int start,int end)
    {
        if (start>end) return -1;
        int mid=start+(end-start)/2;
        if (arr[mid]==target)
            return mid;
        if(arr[mid]>target)
            return BS(arr,target, start,mid-1);
        else
            return BS(arr,target, mid+1,end);


    }
    public static void main(String[] args) {
        int[] arr ={8,9,10,11,12,13,1,2,3,4,5};
        System.out.println(BS(arr,5,0,arr.length-1));
//        System.out.println(arr[BS(arr,6,0,arr.length-1)]);
    }
}
