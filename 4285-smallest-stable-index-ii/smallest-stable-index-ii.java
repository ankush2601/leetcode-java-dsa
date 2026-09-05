class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int suff[] = new int[n];
        suff[n-1] = nums[n-1];
        
     
        //suffix min
        for(int i = n-2; i >=0; i--){
            suff[i] = Math.min(nums[i],suff[i+1]);
        }

        // Maxprefix
        int prefix = nums[0];
    
        for(int i = 0; i < n; i++){
            prefix = Math.max(nums[i],prefix);
            if(( prefix-suff[i] ) <= k){
                return i;
            }
        }
        return -1;
    }
}