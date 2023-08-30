package LeetQutions;

import java.lang.reflect.Array;
import java.util.Arrays;
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
public class LEET268 {
    public static int missingNumber(int []arr){
        cSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=i){
                return i;
            }

        }

        return arr.length;
    }
    public static void cSort(int []arr){
        int i=0;
        while(i< arr.length){
            int corr_inx=arr[i];
            if(corr_inx>arr.length-1){
                i++; continue;
            }
            if(corr_inx!=i){
                int temp=arr[corr_inx];
                arr[corr_inx]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int []arr={0,3,5,2,1};
//        cSort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(missingNumber(arr));
    }


}
