package StringEXP;

public class EXP2 {
    public static void main(String[] args)
    {
        // pointing to different  object
        String a = new String("obj");
        String b = new String("obj");
        System.out.println(a==b);          // check whether pointing to same object or diffrent object.
        System.out.println(a.equals(b));  // check whether objects values are  same  or diffrent .

        // pointing to same object
        String a1 = "obj";
        String b1= "obj";
        System.out.println(a1==b1);




    }


}
