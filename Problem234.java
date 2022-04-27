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
    public boolean isPalindrome(ListNode head) {
        ListNode current = head;
        byte original[] = new byte[100000];
        int count = 0;
        do{
            current = current.next;
            count++;
        }while(current != null);
        
        for(int i =0, k=count-1; i < (count/2) ;i++,k--){
            if(original[i] != original[k]) return false;
        }
        
        return true;
    }
}
