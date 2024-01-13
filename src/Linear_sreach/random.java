package Linear_sreach;

import java.util.Random;
import java.util.Scanner;

public class random
{
  public int number_geuss=0;
    public int random;
    public int input;
    random(){
        Random r = new Random();
        random=r.nextInt(0,100);
    }

    public void input(){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        input= sc.nextInt();
    }
    public boolean iscorrect( ){
        number_geuss++;
        if(random==input){
            System.out.println("winner \n"+"number of guess"+number_geuss);
            return true;
        }
        else if(random>input){
            System.out.println("Too low");
            return false;
        }
        else{
            System.out.println("Too high...");
            return false;
        }


    }


    public static void main(String[] args) {
        random r=new random();

        boolean a= false;

        while(!a) {
            r.input();
            a=r.iscorrect();
        }
    }
}
