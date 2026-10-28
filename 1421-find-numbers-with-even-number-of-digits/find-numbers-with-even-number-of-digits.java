class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int num:nums){
            int val = String.valueOf(num).length();
            if(val % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}