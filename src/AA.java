import java.util.Arrays;

import static Sorting.Selction.Selection_Sort.swap;

public class AA {
    public static void help(String a){
        int l=a.length()-1;
        rev(a,l);

    }
    public static void rev(String a, int l){
        if(l<0){ return;}
        System.out.print(a.charAt(l));

        rev(a,l-1);
    }

    public static void main(String[] args) {

    help("hello");

    }
}