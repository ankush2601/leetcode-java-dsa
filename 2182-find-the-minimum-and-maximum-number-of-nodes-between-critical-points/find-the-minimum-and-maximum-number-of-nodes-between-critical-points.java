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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int res[] = {-1,-1};
        ListNode fast = head.next;
        ListNode temp = head;
        int min = -1;
        int max = -1;
        ArrayList<Integer> list = new ArrayList<>();
        int ind = 1;
        while( temp != null &&fast != null && fast.next != null){
            // for minima
            if(temp.val > fast.val && fast.val < fast.next.val){
                
                list.add(ind);
                 temp = fast;
                
            
            }

            //maxima
            else if(temp.val < fast.val && fast.val > fast.next.val){
                list.add(ind);
                 temp = fast;
                
            }
            ind++;
            temp = fast;
            fast = fast.next;
            

        }
        int min1 = Integer.MAX_VALUE;

        if(list.size()>=2){
          res[1] = list.get(list.size()-1) - list.get(0);
          for(int i = 1; i < list.size(); i++){
            min1 = Math.min(min1,(list.get(i)-list.get(i-1)));
          }
        res[0]=min1;
        }
        
        return res;
    }
}