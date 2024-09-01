package LinkedList;
class LL{
    private int size=0;
    private ListNode head,tail;

    public void size(){
        System.out.println(size);
    }

    public void insertAtStart(int val){
       ListNode node = new ListNode(val);
       node.next=head;
       head=node;
       if(tail==null){
           tail=head;
       }
       size++;



    }
    private int check(int index){
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return -1;
        }
        return index;
    }

    public int delete(int index) {
        if (check(index) == index) {
            int deletedValue;
            if (index == 0) {
                deletedValue = head.val;
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            }
            else {
                ListNode prev = head;
                for (int i = 0; i < index - 1; i++) {
                    prev = prev.next;
                }
                deletedValue = prev.next.val;
                prev.next = prev.next.next;
                if (prev.next == null) {
                    tail = prev;
                }
            }
            size--;
            return deletedValue;
        }
        return -1;
    }

//    public int delete(int index){
//        if(head==tail){
//            tail=null;
//            head=null;
//            return -1;
//        }
//        Node temp=head;
//        Node temp2;
//        for (int i = 1; i < index; i++) {
//            temp=temp.next;
//        }
//        temp2=temp.next;
//        int v=temp2.val;
//        temp2=temp2.next;
//
//        temp.next=temp2;
//
//        return v;
//    }


    public void insert(int val,int index){
        var node = new ListNode(val);
        if(index==0){ insertAtStart(val);
            return;}
        if(index>size+1||index<0){
            System.out.println("Index out of bound");
        }
        if(size+1==index) {
            insertAtEnd(val);
            return;}

        ListNode temp=head;
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

        ListNode temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        var node = new ListNode(temp.next, val);
        temp.next=node;
        size++;

    }

    public void insertAtEnd(int val){
        ListNode node = new ListNode(val);
        if(head==null){
            tail=node;
            head=tail;
        }else {
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public int search(int index ){
        ListNode temp=head;
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
        ListNode temp=head;
        while(temp!=null) {
            System.out.print("-> "+temp.val);
            temp=temp.next;
        }
        System.out.println();
    }

    private ListNode insrtrec(int val, int index, ListNode node){
        if(index==0){
            ListNode temp = new ListNode(node,val);
            return temp;
        }
        node.next=insrtrec(val,index-1,node.next);
        return node;
    }
    public void insrtrec(int val, int index){
        System.out.println(head.val);
        head =insrtrec(val, index,head);
        System.out.println(head.val);
    }
    public void deleteDuplicates(){
        deleteDuplicates(head);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node=head;
        while(node.next!=null){
            if(node.next.val==node.val){
                node.next=node.next.next;
            }else{
                node=node.next;
            }
        }
        return node;

    }


        class ListNode {
        private ListNode next;
        private int val;

        public ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }

        ListNode(int val){
            this.val=val;
        }

            public ListNode() {

            }
        }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode ans = new ListNode();
       while(list1!=null&&list2!=null){
           if(list1.val<list2.val){
               ans.val=list1.val;
               list1=list1.next;

           }else {
               ans.val=list2.val;
               list2=list2.next;

           }
       }
       while(list1!=null){
           ans.val=list1.val;
           list1=list1.next;
       }
       while(list2!=null){
           ans.val=list2.val;
           list2=list2.next;

       }

       return ans;
    }



    public static void main(String[] args) {
        LL l=new LL();
        l.insertAtStart(3);
        l.insertAtStart(2);
        l.insertAtStart(1);
        l.insertAtStart(3);
        l.insertAtStart(3);
//        LL m= l.mergeTwoLists(l.head,l2.head);
        l.display();
        l.removeElements(3);
        l.display();


    }

//    void rev(){
//        rev(head, null);
//    }

    ListNode rev(ListNode head, ListNode prev){
        if(head.next==null){
            head.next=prev;
            return head;
        }
        ListNode newHead =rev(head.next,head);
        head.next=prev;
        return newHead;
    }

    void rev() {
        if (head != null) {
            head = rev(head, null);
        }
    }

    void r(){
        ListNode temp=head;
        ListNode newNode=null;

        while(head !=null){
            ListNode next=head.next;
            head.next=newNode;
            newNode=head;
            head=next;

        }
        head=newNode;
    }


    void r1() {
        ListNode temp = head;
        ListNode newNode = null;

        while (temp != null) {
            ListNode next = temp.next;
            temp.next = newNode;
            newNode = temp;
            temp = next;
        }

        head = newNode;
    }

    // Recursive method to reverse the linked list
//    Node rev(Node current, Node prev) {
//        if (current == null) {
//            return prev;
//        }
//        Node next = current.next;
//        current.next = prev;
//        return rev(next, current);
//    }


    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){return head;}
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prevleft = dummy;

        for(int i=0;i<left-1;i++){
            prevleft=prevleft.next;
        }
        ListNode curr =prevleft.next;
        ListNode subHead=curr;
        ListNode prev=null;
        for(int i=0;i<right-left+1;i++){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        prevleft.next=prev;
        subHead.next=curr;
        return dummy.next;

    }
    public void removeElements( int val){
        removeElements(head,val);
    }

    public ListNode removeElements(ListNode head, int val) {
        while(head.val==val){
            head=head.next;
        }
        ListNode temp = head;
        while(temp!=null){
            if(temp.next.val==val){
                temp.next=temp.next.next;

            }
            temp=temp.next;
        }
        return head;
    }


}
