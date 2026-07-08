class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
    
        for(int i = 0; i < students.length; i++){
            q.offer(students[i]);
        }
       
        int i = 0;
        int rot = 0;
        while(!q.isEmpty() && rot < q.size()){
            if(q.peek() == sandwiches[i]){
                q.poll();   //eaten
                rot = 0;
                i++;
            }
            else{
                rot++;
                q.offer(q.poll());    //add front element to the rear
               
            }
        }
        return q.size();
    }
}