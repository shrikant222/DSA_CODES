//package LinkedList;
//import LinkedList.LL;
//public class Leet83 {
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    class Solution {
//        public LL.Node deleteDuplicates(LL.Node head) {
//            LL.Node node=head;
//            while(node!=null&&node.next!=null){
//                if(node.next.val==node.val){
//                    node.next=node.next.next;
//                }else{
//                    node=node.next;
//                }
//            }
//            return head;
//
//        }
//    }
//}
