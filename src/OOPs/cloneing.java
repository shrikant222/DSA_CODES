package OOPs;

public class cloneing implements  Cloneable{
    int age;String name;

    @Override
    public String toString() {
        return "cloneing{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public cloneing(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        cloneing h =new cloneing(11,"aa");
        cloneing h2= (cloneing) h.clone();
        System.out.println(h2);
    }

}
