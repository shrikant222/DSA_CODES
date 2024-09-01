package Sorting.Selction;

import java.util.Arrays;

public class InPlace_MergeSort {
    public static void main(String[] args) {
    int[]arr={5,4,3,2,1};
    mergeSort(arr,0, arr.length);

        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[]arr,int start, int end){
        if(end-start==1)return;
        int mid =(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);

        merge(arr,start,mid,end);

    }
    public static void merge(int[]arr,int start,int mid,int end){
        int []mix= new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid&&j<end){
            if(arr[i]<arr[j]){
                mix[k++]=arr[i++];
            }
            else{
                mix[k++]=arr[j++];
            }
        }
        while(i<mid){
            mix[k++]=arr[i++];
        }
        while(j<end){
            mix[k++]=arr[j++];
        }
//        if (k >= 0) System.arraycopy(mix, 0, arr, start , k);
        for(int l=0;l<mix.length;l++){
            arr[start+l]=mix[l];
        }
    }



}
