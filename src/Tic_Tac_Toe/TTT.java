package Tic_Tac_Toe;

import java.util.Scanner;

class TTT{
    public static void main(String[] args) {

        char [][]borad= new char[3][3];
        Scanner sc = new Scanner(System.in);
        initzalization(borad);
        printborad(borad);
        boolean gameover=false;
        char player='x';

        while(!gameover){

            gameover = isfull(borad);
            if (gameover) {
                System.out.println("The board is full!");
            }

            System.out.println("Player "+player+":- ");
            int x=sc.nextInt();
            int y=sc.nextInt();
            gameover=isfull(borad);
            if(borad[x][y]==' '){
                borad[x][y]=player;
                printborad(borad);
                if(iswin(borad,player)){
                    System.out.println(player+" Win!!!!");
                    gameover=true;
                }
                else{
                    player=(player=='x')?'o':'x';
                }
            }
            else {
                System.out.println("Invalid Move!!!");
            }
        }

    }

    private static boolean isfull(char[][] borad) {
        for (char[] chars : borad) {
            for (int j = 0; j < borad.length; j++) {
                if (chars[j] == ' ') return false;
            }

        }
        return true;
    }

    private static boolean iswin(char[][]board,char player) {
        for (char[] chars : board) {
            if (chars[0] == player && chars[1] == player && chars[2] == player) {
                return true;
            }
        }
        for (int col = 0; col < board[0].length; col++) {
            if(board[0][col]==player &&board[1][col]==player&&board[2][col]==player){
                return true;
            }
        }
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
            return  true;
        }
        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
            return  true;
        }
        return false;
            }

    private static void printborad(char[][] borad) {
        for (char[] i : borad) {
            for (int j = 0; j < borad.length; j++) {
                System.out.print(i[j] + " |");
            }
            System.out.println();
        }
    }
    private static void initzalization(char[][] borad) {
        for (int i = 0; i < borad.length; i++) {
            for (int j = 0; j < borad.length; j++) {
                borad[i][j]=' ';
            }

        }
    }

}
