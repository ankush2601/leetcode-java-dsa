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
    public int maxDepth(Node root) {
        List<List<Integer>> flist = new ArrayList<>();
        if(root == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int levelNum = q.size();                    
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < levelNum; i++){           //iterate on all nodes of the level
                Node curr = q.poll();
                list.add(curr.val);                     //add val of current Node to sublist(list);

                int j = 0;
                while(j < curr.children.size()){       //add children to the queue
                    q.offer(curr.children.get(j));
                    j++;
                }
               
            }
            flist.add(list);
        }
        return flist.size();
    }
}