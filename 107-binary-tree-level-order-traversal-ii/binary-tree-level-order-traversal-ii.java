/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> flist = new ArrayList<>();
        Stack<List<Integer>> st = new Stack();
        f(st,root);
        while(!st.isEmpty()){
            flist.add(st.pop());
        }
        return flist;

    }
    public static void f(Stack<List<Integer>> st, TreeNode root){
        if(root == null){
            return ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelNum = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < levelNum; i++){
                if(q.peek().left != null){
                    q.add(q.peek().left);
                }
                if(q.peek().right != null){
                    q.add(q.peek().right);
                }
                list.add(q.poll().val);
            }
            st.push(list);
        }
    return;
    }
}
