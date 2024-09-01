package AAATRY;

class Solution {
    StringBuffer sb = new StringBuffer();
    public int getDecimalValue(ListNode head){
        while(head!=null){
            sb.append(head.val);
            head=head.next;
        }
        return binaryToDecimal(sb.toString());
    }
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        // Iterate over each bit in the binary string
        for (int i = 0; i < length; i++) {
            // Get the bit value (0 or 1)
            int bit = binary.charAt(length - 1 - i) - '0';

            // Calculate the decimal value
            decimal += bit * Math.pow(2, i);
        }

        return decimal;
    }



}
class Solution1 {
    public ListNode removeElements(ListNode head, int val) {
    while(head.val==val){
        head=head.next;
    }
    ListNode temp = head;
    while(temp!=null){
        if(temp.next.val==val){
            temp.next=temp.next.next;
            temp=temp.next;
        }
    }
    return head;
    }
}