import java.util.Arrays;

class AA {
    public static void main(String[] args) {
        int []arr={1,4,5,3,2};
        ff(1,4,arr,1);
        System.out.println(Arrays.toString(arr));

    }


    public static void ff(int col , int row,int[]arr,int i){
        if(row<1)return;
        if(col!=0){
            if(arr[col]<arr[col-1]){
                int temp =arr[col];
                arr[col]=arr[col-1];
                arr[col-1]=temp;
                ff(col-1,row,arr,i);
            }
            else   ff(0,row,arr,i);

        }
        else {
            ff(i+1,row-1,arr,i+1);
        }
    }













    public static void ff(int[]arr,int r,int c,int max){
        if(r==0)return;
        if(r>c) {
            if (arr[c+1] > arr[max]) {
                ff(arr, r, c + 1, c+1);
            }
            else ff(arr,r,c+1,max);

        }
        else{

                int temp =arr[max];
                arr[max]=arr[r];
                arr[r]=temp;
            ff(arr,r-1,0,0);
            }


    }




}