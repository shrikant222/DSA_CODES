package OOPs.inhe;

public class inheritance1 implements Cloneable {
    int num;
    float f;

    public inheritance1(int num, float f) {
        this.num = num;
        this.f = f;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "{"+num+" "+f +"}";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        inheritance1 obj = new inheritance1(10,10.0f);
        obj.clone();

    }


}
