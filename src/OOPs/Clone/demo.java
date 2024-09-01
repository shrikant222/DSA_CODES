package OOPs.Clone;

class Student implements Cloneable{
    String name;int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Student s = new Student("s",10);
        Student s2 = (Student)s.clone();



    }
}