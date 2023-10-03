package Recursion;

import java.util.Arrays;

public class InPlace_MergeSort {
    public static void main(String[] args) {
    int[]arr={5,4,6,3,2,1};
    int []ans=mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(ans));
    }

    static int [] mergeSort(int []arr, int start, int end){
        if(start==1) return arr;

        int mid = arr.length/2;
        int[]left = mergeSort(arr,0,mid-1);//mid excluded
        int[]right =mergeSort(arr,mid,end);;
        return merge(left,right);
    }
    static int[] merge(int[]first,int[]second){
        int []mix = new int [first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length&&j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i< first.length){
            mix[k]=first[i];
            k++;i++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }



}
