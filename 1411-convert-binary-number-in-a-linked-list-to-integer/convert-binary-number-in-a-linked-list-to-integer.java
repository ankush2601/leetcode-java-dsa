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
        int ans = 0;
        int ind = 0;
        for(int i = res.length()-1; i >= 0; i--){
            int sum =  (int)Math.pow(2,ind++) ;
            sum *= res.charAt(i)-'0';
            ans += sum;
            sum = 0;
        }
        return ans;
    }
}