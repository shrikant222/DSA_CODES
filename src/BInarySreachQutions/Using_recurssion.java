package BInarySreachQutions;

public class Using_recurssion {
    static int sreach(int []arr,int start, int end, int target){
        if (start > end) {
            return -1; // Target not found
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid]<target){
            return sreach(arr,mid+1,end,target);
        }
        else{
            return sreach(arr,start,mid-1,target);
        }


    }


    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        System.out.println(  sreach(arr,0,4,50));
    }
}
