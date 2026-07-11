class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        st.push(root);

        while (!st.isEmpty()) {
            root = st.pop();
            list.add(root.val);

            if (root.right != null) {
                st.push(root.right);
            }

            if (root.left != null) {
                st.push(root.left);
            }
        }

        return list;
    }
}