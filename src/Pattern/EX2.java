package Pattern;

public class EX2 {
    //4
    static void priNumber(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }


   //5
   static void pattern5(int n)
   {
       int col_count=0;
       for (int i = 0; i <2*n ; i++)
       {
           if(i<=n) col_count=i;
           else col_count-=1;
           for (int j = 0; j < col_count; j++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }

   }

    static void pattern5_5(int n)
    {
        int col_count=0;
        for (int row = 0; row <2*n ; row++)
        {
            if(row>n) col_count=2*n-row;
            else col_count =row;
            for (int col = 0; col < col_count; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern6(int n)
    {
        int col_count=0;
        for (int i = 0; i <2*n ; i++)
        {
            if(i<=n) col_count=i;
            else col_count-=1;
            for (int k = 0; k < n-col_count; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <col_count; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *

    }




//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *


    public static void main(String[] args) {
        int n=5;
        pattern6(n);
    }
    static void pattern30(int n) {


        for (int row = 1; row <=n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col > 1; col--) {
                System.out.print(col);
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }


            System.out.println();
        }
//            1
//           212
//          32123
//         4321234
//        543212345
        }


    static void pattern17(int n) {


        for (int row = 1; row <= 2*n; row++)
        {
            int count= row>n?2*n-row-1:row;

            for (int space = 0; space < n -count; space++) {
                System.out.print(" ");
            }
            for (int col = count; col > 1; col--) {
                System.out.print(col);
            }
            for (int col = 1; col <= count; col++) {
                System.out.print(col);
            }


            System.out.println();
        }
    }
}


