/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;
        ListNode n1 = l1;
        ListNode n2 = l2;
        int extra = 0;
        while( n1 != null || n2 != null || extra > 0){
            int value = 0;
            int value1 = 0;
            int value2 = 0;
            if(n1 != null){
                value1 = n1.val;
                n1 = n1.next;
            }
            if(n2 != null){
                value2 = n2.val;
                n2 = n2.next;
            }
            value = value1 + value2 + extra;
            extra = 0;
            while(value > 9){
                value = value - 10;
                extra++;
            }
            //System.out.println("Extra ={"+extra+"} Value={"+value+"}");
            if(head == null){
                head = new ListNode(value);
                temp = head;
            }else{
                temp.next = new ListNode(value);
                temp = temp.next;
            }
        }
        return head;
    }
}
