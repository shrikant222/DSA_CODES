package Recursion.subString;

public class Remove_a {

        public static void main(String[] args) {

            StringBuilder sb= new StringBuilder();
            String ss="abacd";
            String ans="";
            System.out.println(fun(ss));

        }

    public static String fun(String input){
        if(input.isEmpty())return input;
        char a=input.charAt(0);
        if(a=='a'){
            return   fun(input.substring(1));
        }
        else {
            return fun(input.substring(1))+a;
        }
    }



        public static void fun(StringBuilder sb,int i,String ss){
            if(i==ss.length())return;
            char a=ss.charAt(i);
            if(a!='a')sb.append(a);
            fun(sb,++i,ss);

        }
         public static String fun(String ss,String ans){
            if(ss.isEmpty())return ans;

            char a=ss.charAt(0);
            if(a=='a'){
                return fun(ss.substring(1),ans);
            }
            else {
                return fun(ss.substring(1),ans+a);
            }
        }



    }

