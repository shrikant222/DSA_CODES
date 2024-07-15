package LinkedList;

class AA{
    private Node Head, Tail;
    private int size;
    public void insertatStart(int val){
        Node node = new Node(val);
        node.next = Head;
        node.prev = null;
        if(Head!= null){
            Head.prev =node;
        }
        Head=node;

        if(Tail==null){
            Tail=Head;
        }
        size++;
    }
    public void insertatEnd(int val){
        if(Tail==null){
            insertatStart(val);
        }
        else {
            Node node = new Node(val);
            node.prev = Tail;
            Tail.next = node;
            Tail = node;
        }
        size++;
    }
    public void size(){
        System.out.println(size);
    }
    public void insert(int index,int val){
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            insertatStart(val);
            return;
        }
        if(index==size){
            insertatEnd(val);
            return;
        }
        Node node = new Node(val);
        Node temp = Head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next!=null){
            node.next.prev =node;
        }


    }



    public void display(){
        Node temp=Head;
        while(temp!=null) {
            System.out.print("-> "+temp.data);
            temp=temp.next;
        }
        System.out.println(" END ");
    }
    public void display1(){
        Node temp=Tail;
        while(temp!=null) {
            System.out.print("-> "+temp.data);
            temp=temp.prev;
        }
        System.out.println(" START");
    }














    private class Node{
        int data;
        Node next;
        Node prev;
      Node(Node next,int data,Node prev){
          this.next = next;
          this.data=data;
          this.prev=prev;
      }
      Node(int data){
          this.data=data;
      }
    }



}
class main1{
    public static void main(String[] args) {
        AA a = new AA();
        a.insertatStart(2);
        a.insertatStart(1);
        a.insertatEnd(3);
        a.insertatEnd(4);
        a.insertatEnd(5);

        a.insert(4,10);
        a.display();
        a.display1();
    }
}