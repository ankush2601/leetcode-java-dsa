class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int c = 0;
        for(int i = 0; i < tickets.length; i++){
            q.offer(i);   //add index to Queue
        }

        while(tickets[k] != 0){
            int ind = q.peek();
            if(q.size() == 1){
                c += tickets[q.peek()];
                tickets[q.peek()] -=  tickets[q.peek()] ;
                break;
            }
            else if(tickets[q.peek()] == 1){
                c++;
                tickets[ind] -= 1;
                q.remove();

            }
            else{
                c++;
                tickets[ind]--;
                q.add(q.remove());
            }
        }
        return c;
    }
}