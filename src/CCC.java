import java.util.Arrays;
public class CCC {
    public static void main(String[] args) {
        int[]arr={1,5,4,2,3};
//        System.out.println(yes(arr,arr.length-1,true));
//        Qsort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(yes(arr,arr.length-1,true));
        fun(arr,arr.length-1,1,1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Qsort(int[]arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        int s=left,e=right;
        int pivot=arr[mid];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;e--;
            }

        }
        Qsort(arr,left,e);
        Qsort(arr,s,right);
    }


    public static boolean yes(int[]arr , int i, boolean y){
        if(i<1){
            return true;
        }
        return arr[i]>=arr[i-1] && yes(arr,i-1,y);
    }


    public static void fun(int[]arr,int row, int col, int i){
        if(row<1){return;}
        if(col!=0){
            if(arr[col]<arr[col-1]){
                int temp=arr[col];
                arr[col]=arr[col-1];
                arr[col-1]=temp;
                fun(arr,row,col-1,i);
            }
            else{
                fun(arr,row-1,i+1,i+1);
            }
                    }
        else{

            fun(arr,row-1,i+1,i+1);
        }
    }

























public static void Msort(int[]arr,int start,int end){
    if(end-start==1){return;}
    int mid = (start+end)/2;
    Msort(arr,start,mid);
    Msort(arr,mid,end);
    merge(start,end,mid,arr);
}
public static void merge(int start,int end,int mid, int[]arr){
        int i=start,j=mid,k=0;
        int[] res = new int[end-start];
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                res[k++]=arr[i++];
            } else if (arr[i]>arr[j]) {
                res[k++]=arr[j++];

            }
        }
        while(i<mid){
            res[k++]=arr[i++];
        }

        while(j<end){
            res[k++]=arr[j++];
        }
    for (int l = 0; l < res.length; l++) {
        arr[l+start]=res[l];
    }
}
}
