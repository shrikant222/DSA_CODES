package Pattern;

public class Pattern2 {
    public static void main(String[] args) {
    p3();
    }


    public static void p1() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            //for every row, run the col;
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline:
            System.out.println();

        }
    }
    public static void p3() {
        int n = 50;
        for (int row = 1; row <= n; row++) {
            //for every row, run the col;
            for (int col =1; col<=n-row+1; col++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline:
            System.out.println();
        }

//* * * * *
//* * * *
//* * *
//* *
//*
    }

    public static void p4(){
        int n=4;
        for (int i  = 1; i<=n; i ++) {
            //for every row, run the col;
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline:
            System.out.println();
        }
    }











}