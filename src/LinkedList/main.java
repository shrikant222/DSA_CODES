package LinkedList;

public class main {
    public static void main(String[] args) {
        LL ob = new LL();
        ob.insertAtStart(1);
        ob.psize();
        ob.insertAtStart(5);
        ob.psize();
        ob.insertAtStart(4);
        ob.psize();
        ob.insertAtStart(3);
        ob.psize();
       ob.insert1(60,3);
        ob.psize();
//        System.out.println(ob.delete(3));
        ob.display();
        System.out.println();
        System.out.println(ob.serach(610));



    }
}
