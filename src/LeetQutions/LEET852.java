package LeetQutions;

public class LEET852 {
    // linear search
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1025751065/
    public static int sreach(int []arr){
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[ans]<arr[ans+1]){
                ans+=1;
            }
            else {
                break;
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        int [] arr = {0,2,1,0};
        System.out.println(sreach(arr));
        System.out.println(peakIndexInMountainArray(arr));
    }

// by own method
        public static int own(int[] arr)
        {

            int start =0;
            int end = arr.length-1;

            while(end>=start){
                int mid = start+(end -start)/2;
                if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                    return mid;
                }
                else if (arr[mid]>arr[mid+1]) {
                    end=mid-1;
                }

                else{
                    start=mid+1;
                }


            }
            return -1;

        }



        public static int peakIndexInMountainArray(int[] arr) {
            int start =0;
            int end = arr.length-1;

            while(end>start){
                int mid =start+(end-start)/2;

                if(arr[mid]>arr[mid+1]){
                    end=mid;
                }
                else {
                    start=mid+1;
                }

            }
            return start;
        }
    }
