import java.util.*;
import java.io.*;
import java.math.BigDecimal;

class AA{
    public static void pp(int n){
        if(n==0)return;
        n--;
        System.out.println("shri");
        pp(n);

    }
    public static void main(String[] args) {
        pp(4);
    }
}