class Solution {
    public boolean canJump(int[] nums) {
        int mr = 0;
        for(int i = 0; i< nums.length; i++){
            if(i>mr){
                return false;
            }
            mr = Math.max(i+nums[i],mr);
        }
        return true;
    }
}