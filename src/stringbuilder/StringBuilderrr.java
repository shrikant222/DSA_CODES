package stringbuilder;

public class StringBuilderrr {

        public static void main(String[] args)
        {
            StringBuilder str = new StringBuilder("shri");
            
            System.out.println(str.indexOf("s"));
            for (int i = 0; i <26 ; i++)
            {
                char ch =(char)('a'+i);
                str.append(ch);
            }
            System.out.println(str);
            //" "+a;
            //a+b;
            //ab+c
            //new object is being created every time.
        }
    }

