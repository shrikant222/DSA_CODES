package Sorting.Selction;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int[]arr={5,4,6,3,2,1};
    int []ans=mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int [] mergeSort(int []arr){
        if(arr.length==1) return arr;

        int mid = arr.length/2;
        int[]left = mergeSort(Arrays.copyOfRange(arr,0,mid));//mid excluded
        int[]right =mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

//        int []left=new int[mid];
//        int []right=new int[arr.length-mid];
//        int i=0;
//        int j=0;
//        while(i<arr.length){
//            if(i<mid){
//                left[i]=arr[i++];
//            }
//            if(i>=mid){
//                right[j++]=arr[i++];
//            }}
//        left = mergeSort(left);
//        right = mergeSort(right);

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
