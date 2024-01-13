package Recursion;

public class Pattern {
    static void trinage(int row, int col){
        if(row==0) return;;

        if(col<row){
            System.out.print("*");
            trinage(row,col+1);
        }
        else{
            System.out.println();
            trinage(row-1,0);
        }
    }


    static void normal_Trinage(int row, int col){
        if(row==0) return;;

        if(col<row){

            normal_Trinage(row,col+1);
            System.out.print("*");
        }
        else{

            normal_Trinage(row-1,0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        normal_Trinage(4,0);
    }
}
