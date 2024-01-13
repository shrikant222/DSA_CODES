package Sorting.Selction;

import java.util.Arrays;

public class CyclicSort {
    public static void sort(int[]arr){
      int i=0;
      while(i<arr.length){
          //starting from 0 therefore index==element
          // starting from 1 then correct=arr[i]-1;
          int correct=arr[i]-1;
          if(correct<arr.length&&arr[correct]!=arr[i]){
              int temp=arr[i];
              arr[i]=arr[correct];
              arr[correct]=temp;
          }
          else i++;
      }
    }
    public static void main(String[] args) {
        //starting from 0 therefore index==element
        int []arr={1,2,2,4};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
