import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int start=0;
        int end = arr.length-1;
        int target=10;
        while(start<=end){
            int mid = start+(end -start)/2;
//            int mid =start+(start-end)/2;
            if (arr[mid]==target) {System.out.println("found at index "+mid); return;}
            else if(arr[mid]<target){ start=mid+1;}
            else end = mid-1;
        }
        System.out.println("not found");

    }

}


