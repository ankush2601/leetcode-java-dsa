class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int l = 0, r = 0;
        int inc = 1, dec = 1, maxlen = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                inc++;
                dec = 1;
            }
            if(nums[i] < nums[i-1]){
                dec++;
                inc = 1;
            }
            if(nums[i] == nums[i-1]){
                inc = 1;
                dec = 1;
            }
            maxlen = Math.max(maxlen,Math.max(inc,dec));
        }
        return maxlen;
    }
}