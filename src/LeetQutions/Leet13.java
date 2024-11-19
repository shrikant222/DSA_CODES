package LeetQutions;

public class Leet13 {
    public static int romanToInt(String s) {
        int num=0;
        for(int i=0;i<s.length();i++){
            int temp=0;
            char ch=s.charAt(i);
            if(ch=='I'|| ch=='i') temp=1;
            if(ch=='V' || ch=='v') temp=5;
            if(ch=='X' || ch=='x') temp=10;
            if(ch=='L' || ch=='l') temp=50;
            if(ch=='C' || ch=='c') temp=100;
            if(ch=='D' || ch=='d') temp=500;
            if(ch=='M' || ch=='m') temp=1000;

            num+=temp;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
