package LeetQutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class LEET442 {
    public static List<Integer> findDuplicates(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else i++;
        }
        List<Integer>list= new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                list.add(arr[j]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        //starting from 0 therefore index==element
        int []arr={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}