package BInarySreachQutions;

public class BS_Recursion {

    static int BS(int []arr, int target, int start,int end){
        if(start>end) return -1;
        int mid=start+(end-start)/2;
        if (arr[mid]==target)
        return mid;
        if(arr[mid] >target)
        return BS(arr,target, start,mid-1);
        else
        return BS(arr,target, mid+1,end);

    }
    public static void main(String[] args) {
        int arr []={1,2,6,9,10,15,20};
        System.out.println(BS(arr,6,0,arr.length-1));
    }
}
