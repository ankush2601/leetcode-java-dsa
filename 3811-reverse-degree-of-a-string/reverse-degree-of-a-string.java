class Solution {
    public int reverseDegree(String s) {
        int ans = 0, ind = 1;
        for(char ch:s.toCharArray()){

            int val = 26 - (ch - 'a');
            ans += (val * ind++);
        }
        return ans;
    }
}