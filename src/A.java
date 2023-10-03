import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        System.out.println(sum(123,0));

    }
public static int sum(int num, int sum){
if(num/10==0) return num;
sum=sum+(num%10);
return sum(num/10,sum);

}
}

