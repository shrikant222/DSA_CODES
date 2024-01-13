package Pattern;

public class EX3 {


    static void pattern(int n){
//        0 0 0 0 0 0 0 0 0
//        0 1 1 1 1 1 1 1 0
//        0 1 2 2 2 2 2 1 0
//        0 1 2 3 3 3 2 1 0
//        0 1 2 3 4 3 2 1 0
//        0 1 2 3 3 3 2 1 0
//        0 1 2 2 2 2 2 1 0
//        0 1 1 1 1 1 1 1 0
//        0 0 0 0 0 0 0 0 0
        n=n*2;
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <=n ; j++) {
                int v=  Math.min(Math.min(i,n-i),Math.min(j,n-j));
                System.out.print(v+" ");
            }
            System.out.println();
        }

    }


    static void pat(int n){
        int N=n;
        n=n*2;
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <=n ; j++) {
                int v=N-Math.min(Math.min(i,n-i),Math.min(j,n-j));
                if(v==0) v=1;
                System.out.print(v+" ");
            }
            System.out.println();
        }

    }

//            4 4 4 4 4 4 4 4 4
//            4 3 3 3 3 3 3 3 4
//            4 3 2 2 2 2 2 3 4
//            4 3 2 1 1 1 2 3 4
//            4 3 2 1 1 1 2 3 4
//            4 3 2 1 1 1 2 3 4
//            4 3 2 2 2 2 2 3 4
//            4 3 3 3 3 3 3 3 4
//            4 4 4 4 4 4 4 4 4

    public static void main(String[] args) {
        pat12(5);
    }
    static void pat12(int n){
        int totalcol=0;
        for (int row = 1; row <=2*n ; row++) {
            if (row<=n)  totalcol=n-row+1;
            else totalcol=row-n;
            int s=n-totalcol;
            for (int space = 0; space <=s; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }




}
