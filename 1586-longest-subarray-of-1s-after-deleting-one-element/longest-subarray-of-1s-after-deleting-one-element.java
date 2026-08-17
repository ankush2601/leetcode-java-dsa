class Solution {
    public int longestSubarray(int[] nums) {
       int z = 0;
       int l = 0, r = 0, n = nums.length;
       int max = 0;
        while(r < n){
            if(nums[r] == 0){
                z++;
            }
            while(z > 1){
                if(nums[l] == 0){
                    z--;
                }
                l++;
            }
            max = Math.max(max,(r-l+1));
            r++;
        }
        return max-1;
    }
}