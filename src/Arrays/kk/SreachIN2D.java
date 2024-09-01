package Arrays.kk;

public class SreachIN2D {


    protected static boolean sreach(int arr[][],int max){

        SreachIN2D obj = new SreachIN2D();
        boolean flag=false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
            if(arr[i][j]==max){

                System.out.println(i+" "+j);
                return true;
            }
            }


        }


        return flag;
    }


    public static void main(String[] args) {
          int [] [] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(sreach(arr,10));
    }
}
