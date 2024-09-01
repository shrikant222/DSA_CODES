package LeetQutions;

public class LEET1095 {
    //https://leetcode.com/problems/find-in-mountain-array/

    public static void main(String[] args) {
        int[] arr = {0,2,1};
        int target = 3;
        System.out.println(search(arr,target));
    }

    public static int search(int []arr,int t)
    {int peak=peak(arr);
        if(arr[peak]==t)return peak;
        if(OABS(arr,0,peak-1,t)!=-1) return OABS(arr,0,peak-1,t);
        else return OABS(arr,peak+1, arr.length-1,t);

    }
    public static int peak(int []arr)
    {
        int s=0, e=arr.length;
        while (s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid+1])
            {
                s=mid+1;
            }
            else
            {
                e=mid;
            }
        }
        return s;
    }

    public static int OABS(int []arr,int s, int e,int t)
    {
        boolean y=arr[s]<arr[e];
        while (s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]==t) return mid;
            if(y){
                if(arr[mid]<t){
                    s=mid+1;
                }
                else {
                    e=mid-1;
                }
            }
            else {
                if (arr[mid] > t) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

}
