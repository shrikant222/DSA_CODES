package Sorting.Selction.Binarysreach;




public class TRY {
    public static int binary(int[]arr){
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


    public static void main(String[] args) {

        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(binary(arr));
    }




}
