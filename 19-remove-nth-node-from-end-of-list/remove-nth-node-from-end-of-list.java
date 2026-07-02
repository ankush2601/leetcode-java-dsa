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
        if(n == 0){
            return head;
        }
        if(head == null ||  head.next == null){
            return null;
        }
         int c = 0;
         ListNode t = head;
         while(t != null){
            t = t.next;
            c = c+1;
         }
         int i = 1;
         t = head;
         while(i < (c - n)){
             t = t.next;
             i = i+1;
         }
         if(c - n == 0){
            head = head.next;
         }
        
         if(t.next.next == null){
            t.next = null;
            return head;
         }
         t.next = t.next.next;
          return head;
    }
}