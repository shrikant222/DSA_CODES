package Linear_sreach;

public interface Max_in_2D {

    public static void main(String[] args) {
        int [][]arr=
                {{2,3,4},
                        {2,400,10},
                        {10,22,33}

                };


        System.out.println( max(arr));
    }

    static int max(int[][] arr){
        int max= Integer.MIN_VALUE;
        for(int[] a1:arr){
            for(int ele:a1){
                if(ele>max){
                    max=ele;
                }
            }
        }
        return max;
    }
}
