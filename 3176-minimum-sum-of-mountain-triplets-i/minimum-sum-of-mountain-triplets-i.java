class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                        
                        if(nums[i] < nums[j] && nums[j] > nums[k] ){
                            int max = nums[i]+nums[j]+nums[k];
                            ans = Math.min(ans,max);
                        }
                        
                }
            }
        }
        return ans == Integer.MAX_VALUE?-1:ans;
    }
}

