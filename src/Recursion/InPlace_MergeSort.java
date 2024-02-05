package Recursion;

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
    public static void merge(int[]arr,int s,int m,int e){
        int []mix= new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m&&j<e){
            if(arr[i]<arr[j]){
                mix[k++]=arr[i++];
            }
            else{
                mix[k++]=arr[j++];
            }
        }
        while(i<m){
            mix[k++]=arr[i++];
        }
        while(j<e){
            mix[k++]=arr[j++];
        }
        if (k >= 0) System.arraycopy(mix, 0, arr, s , k);
    }



}
