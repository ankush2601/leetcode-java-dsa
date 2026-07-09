class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[arr.length];
        q.offer(start);
        visit[start] = true;
        while(!q.isEmpty()){
            int curr = q.poll();
            if(arr[curr] == 0){
                return true;
            }
            int f = curr + arr[curr];  //forward
            int b = curr - arr[curr];  //backward
            
            //check visited or not  for forward
            if(f < arr.length && !visit[f] ){
                visit[f] = true;
                q.offer(f);
            }

            //check visited or not for the backward
            if(f < arr.length && !visit[f] ){
                visit[f] = true;
                q.offer(f);
            }
            if(b >= 0  && !visit[b]){
                visit[b] = true;
                q.offer(b);
            }
        }
        return false;
    }
}