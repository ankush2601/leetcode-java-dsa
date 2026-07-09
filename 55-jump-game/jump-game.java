class Solution {
    public boolean canJump(int[] nums) {
        int finalPos = nums.length-1;
        int ind = nums.length - 2;
        for(int i = ind; i >= 0; i--){
            if(i+nums[i] >= finalPos){
                finalPos = i;
            }
        }
        return finalPos == 0? true:false;
        
    }
}