package LeetQutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class LEET448 {
    public static List<Integer> findDisappearedNumbers(int []arr){
        int i=0;
        while(i< arr.length){
            int corr_inx=arr[i]-1;
            if(arr[corr_inx]!=arr[i]){
                int temp=arr[corr_inx];
                arr[corr_inx]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
        List<Integer> list= new ArrayList<>();
        for (int j = 0; j <arr.length ; j++) {
            if(arr[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(arr));
//        System.out.println(missingNumber(arr));
        System.out.println(Arrays.toString(arr));
    }

}
