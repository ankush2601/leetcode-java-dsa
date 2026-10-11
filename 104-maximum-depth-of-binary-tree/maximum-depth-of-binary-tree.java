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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> flist = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelNum = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < levelNum; i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                
                if(q.peek().right != null) q.offer(q.peek().right);

                list.add(q.poll().val);
            }
            flist.add(list);
        }
        return flist.size();
    }
}