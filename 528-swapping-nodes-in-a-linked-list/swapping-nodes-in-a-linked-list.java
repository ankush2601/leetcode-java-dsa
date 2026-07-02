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
    public ListNode swapNodes(ListNode head, int k) {
        List<ListNode> l = new ArrayList<>();
        ListNode t = head;
        while(t != null){
            l.add(t);
            t = t.next;
        }

        if(l.get(k - 1) != l.get(l.size() - k)){
            ListNode temp = l.get(l.size()-k);
            l.set(l.size()-k,l.get(k-1));
            l.set(k-1,temp);
        }
        

        //make dummy listNode 
        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;

        for(int i = 0; i < l.size(); i++){
            d.next = l.get(i);
            d = d.next;
        }
        d.next = null;
        return dummy.next;
    }
}