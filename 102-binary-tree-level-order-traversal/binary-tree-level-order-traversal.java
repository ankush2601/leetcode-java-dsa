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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> flist = new ArrayList<>();
        f(root,flist);
        return flist;
    }
    public  static void f(TreeNode root,List<List<Integer>>flist ){
       // List<List<Integer>> flist = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return ;
        }

        //add in the queue
        q.add(root);
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
            flist.add(list);
        }
        return ;
    }
}