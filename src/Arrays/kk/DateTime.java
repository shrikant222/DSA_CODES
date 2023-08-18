package Arrays.kk;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Notepad {

        public static List<Integer> addToArrayForm(int[] num, int k) {
            int multi =0,sum=0;
            for(int i=1;i<num.length; i++)
            {
                multi=multi+10;
                sum=num[0];
                int n=num[i];
                sum =sum+(n*multi);

            }
            int total=sum+k;
            System.out.println(total);
            ArrayList<Integer> list= new ArrayList<Integer>();

            for(int i=num.length;i>=0; i--){
                int t2=0;
                t2=  total%10;
                list.add(i,t2);
                total=total/10;


            }
            return list;
        }

    public static void main(String[] args)
    {
            int [] num={2,7,4};
            int k=181;
        System.out.println(addToArrayForm(num,k));
    }
}