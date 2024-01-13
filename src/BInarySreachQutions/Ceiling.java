package BInarySreachQutions;


//smallest number in array greater than or equal to target.
public class Ceiling {

    public static void main(String[] args) {
        int t=0;
        int []arr={100,90,80,70,60,50,40,30,20,10};
        int [] arr1={30,40,50,100};


        System.out.println( ceiling(arr1,51));

        System.out.println(  floor(arr1,51));

    }



    static int ceiling(int[]arr,int target){

        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return arr[mid];
            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        if(start< arr.length){
            return arr[start];
        }
        else {

            return -1;
        }
    }


    static int floor(int[]arr,int target){

        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return arr[mid];
            }
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        if(end> 0){
            return arr[end];
        }
        else {

            return -1;
        }
    }
}
