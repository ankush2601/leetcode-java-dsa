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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        f(res,root);
        return res;
    }
    public static void f(List<Double> res , TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelNum = q.size(); //elements present in each level
            List<Integer> list =  new ArrayList<>();
            for(int i = 0; i < levelNum; i++){
                if(q.peek().left != null){          //store left node in Queue
                    q.offer(q.peek().left);        
                }
                if(q.peek().right != null){
                    q.offer(q.peek().right);         //store right node in Queue
                }
                list.add(q.poll().val);              //add the val of the root    
            }
            double size = list.size();    //size of element in each level
            double sum = 0;
            for(int num : list){
                sum += num;
            }
            res.add(sum/size);
        }
        return;
    }
}