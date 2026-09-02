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
    public int getDecimalValue(ListNode head) {
        String res = "";
        ListNode temp = head;
        while(temp != null){
            res += temp.val;
            temp = temp.next;

        }
        int ans = 0, ind = 0;
        for(int i = res.length()-1; i >= 0; i--){
            if(res.charAt(i) == '1'){
                ans +=  (int)Math.pow(2,ind++) ;
                continue;
            }
            ind++;
        }
        return ans;
    }
}