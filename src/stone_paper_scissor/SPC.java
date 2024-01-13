package stone_paper_scissor;

import java.util.Random;
import java.util.Scanner;

public class SPC {
    public int computer_choice =0;
    public int user_choice;
    SPC()
    {
        Random r = new Random();
        computer_choice=r.nextInt(1,3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice!\n" +
                "  1==stone\n" +
                "  2=paper\n" +
                "  3=scissor;");
        user_choice=sc.nextInt();
    }
    public  void game(){
        if(computer_choice==user_choice) System.out.println("match tie");
        //1==stone
        //2=paper
        //3=scissor;
        else if(computer_choice==1 && user_choice==3) System.out.println("com won!!");
       else if(computer_choice==2  && user_choice==1) System.out.println("Com won!!");
        else if(computer_choice==3 && user_choice==2) System.out.println("Com won!!");

        else{
            System.out.println("We won the match");
        }
    }

    public static void main(String[] args) {
        SPC p =new SPC();
        p.game();
    }

}
