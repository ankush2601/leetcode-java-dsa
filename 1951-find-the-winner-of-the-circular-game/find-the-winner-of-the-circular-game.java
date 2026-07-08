class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.offer(i);
        }
        int t = k;
        while(q.size() > 1){
           
            if(t > 1){
                q.offer(q.poll());
                t--;
                continue;
            }

            q.remove();
            t = k;
        }
        return q.peek();
    }
}