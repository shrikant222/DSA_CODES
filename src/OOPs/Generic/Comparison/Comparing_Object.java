package OOPs.Generic.Comparison;


import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    int roll;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student o) {
        return this.roll-o.roll;
    }
}
public class Comparing_Object {
       public static void main(String[] args) {
           Student s1 = new Student("shrikant",30);
           Student s2 = new Student("Rahul",20);
           Student s3 = new Student("shrikant",10);
           Student s4 = new Student("Rahul",90);
           Student s5 = new Student("shrikant",10);
           Student s6 = new Student("Rahul",20);
           if(s2.compareTo(s1)>0){
               System.out.println("Rahul is>>");
           }
           else {
               System.out.println("Shrikant is>>");
           }
           Student[] list ={s1,s2,s3,s4};
           System.out.println(Arrays.toString(list));
           Arrays.sort(list);
           System.out.println(Arrays.toString(list));

       }
}
