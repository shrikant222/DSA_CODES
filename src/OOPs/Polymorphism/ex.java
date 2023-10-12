package OOPs.Polymorphism;

public class ex {
    int num;
    public ex(int num){
        this.num=num;
    }

    @Override
    public String toString() {
        return "ex{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {

        ex e = new ex(55);
        System.out.println(e);
    }
}
