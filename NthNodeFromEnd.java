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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null || head == null)
            return null;
        
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        int size = 0;
        
        while(ptr1!=null) {
            ++size;
            ptr1 = ptr1.next;
        }
        
        if(n==size)
            return head.next;
        
        while((size-(n++))>1) {
            ptr2 = ptr2.next;
    }
        
        ptr2.next = ptr2.next.next;
        return head;
    }
}
