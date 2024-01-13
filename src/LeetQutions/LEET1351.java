package LeetQutions;

public class LEET1351 {
    public static int countNegatives(int[][] grid) {
        int row=0;
        int col=grid[0].length-1;
        int count=0;
        while(col>=0){
            if(grid[row][col]<0){
             count=count+grid[0].length-row;
             col--;
            }else{
                if(row<grid.length-1)
                row++;
                else row=0;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int [][]arr={{3,2},{1,0}};
        System.out.println(countNegatives(arr));
    }
}
