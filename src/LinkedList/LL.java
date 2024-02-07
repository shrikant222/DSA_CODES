package LinkedList;
class LL{
    private int size=0;
    private Node head,tail;
    public void psize(){
        System.out.println(size);
    }

    public void insertAtStart(int val){
       Node node = new Node(val);
       node.next=head;
       head=node;
       if(tail==null){
           tail=head;
       }
       size++;



    }
    public int delete(int index){
        Node temp=head;
        Node temp2;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        temp2=temp.next;
        int v=temp2.val;
        temp2=temp2.next;

        temp.next=temp2;

        return v;
    }


    public void insert(int val,int index){
        var node = new Node(val);
        if(index==0){ insertAtStart(val);
            return;}
        if(size+1==index) {
            insertAtEnd(val);
            return;}

        Node temp=head;
        while(index!=1){
            temp=temp.next;
            index--;
        }
        node.next=temp.next;
        temp.next=node;
        size++;

    }
    public void insert1(int val,int index){
        if(index==0){ insertAtStart(val);
            return;}
        if(size+1==index) {
            insertAtEnd(val);
            return;}

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        var node = new Node(temp.next, val);
        temp.next=node;
        size++;

    }

    public void insertAtEnd(int val){
        Node node = new Node(val);
        if(tail==null){
            tail=node;
            head=tail;
        }else {
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public int serach(int index ){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.val==index){
              return i;
            }
            i++;
            temp=temp.next;

        }
        return Integer.MIN_VALUE;
    }


//    public void insertAtEnd(int val){
//        Node node = new Node(val);
//        if(tail==null){
//           insertAtStart(val);
//        }else {
//            tail.next=node;
//            tail=node;
//        }
//        size++;
//    }
    public void display(){
        Node temp=head;
        while(temp!=null) {
            System.out.print("-> "+temp.val);
            temp=temp.next;
        }
    }


    private static class Node{
        private Node next;
        private int val;

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }

        Node(int val){
            this.val=val;
        }
    }
}
