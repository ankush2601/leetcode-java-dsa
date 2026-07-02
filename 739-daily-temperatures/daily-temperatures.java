class Solution {
    public int[] dailyTemperatures(int[] tem) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[tem.length];
        for(int i = 0; i < tem.length; i++){
            while(!st.isEmpty()  && tem[st.peek()] < tem[i]){
                res[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        return res;
    }

}