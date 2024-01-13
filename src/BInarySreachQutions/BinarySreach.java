package BInarySreachQutions;

public class BinarySreach {


    public static int binary(int[]arr,int target){
        int start =0;
        int end = arr.length-1;

        while(end>=start){
            int mid = start+(end -start)/2;
            if(arr[mid]>target){
                end =mid-1;
            }
            else if (arr[mid]<target) {
             start =mid+1;
            }

            else{
                return mid;
            }


        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,6,7,8};
        int size = Integer.SIZE; // Size of int in bits
        System.out.println(size);
        System.out.println( binary(arr,4));

    }
}
