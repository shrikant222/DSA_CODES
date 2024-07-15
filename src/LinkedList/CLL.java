package LinkedList;

public class CLL {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node head;
    Node tail;

    CLL(){
        this.head= null;
        this.tail= null;
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
          head=newNode;
          tail=newNode;
          return;
        }
        tail.next = newNode;
        newNode.next=head;
        tail = newNode;

    }
    public void display() {
        if(head == null) {
            System.out.println("Empty List");
        }else {
            Node temp = head;
            do{
                System.out.print(temp.data+"=> ");
                temp = temp.next;
            }while(temp!=head);
        }
    }
}
