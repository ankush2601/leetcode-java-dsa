/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> flist = new ArrayList<>();
        if(root == null){
            return flist;
        }
        Queue<Node> q = new LinkedList<>();
        
        q.offer(root);
        while(!q.isEmpty()){
            int levelNum = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < levelNum; i++){
                Node curr = q.poll();
                list.add(curr.val);
                // for(Node child:curr.children){
                //     q.offer(child);
                // }
                q.addAll(curr.children);
            }
            flist.add(list);
        }
        return flist;
    }
}