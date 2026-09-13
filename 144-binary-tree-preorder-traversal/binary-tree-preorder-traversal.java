class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>list = new ArrayList<>();
        f(root,list);
        return list;
   }
   public static void f(TreeNode root,ArrayList<Integer>list){
        if(root == null){
            return;
        }
        list.add(root.val);
        f(root.left,list);
        f(root.right,list);
        
   }
}