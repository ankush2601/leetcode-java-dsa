class Solution {
    public boolean search(int[] nums, int target) {
        boolean ans = false;
        for(int x:nums){
            if(target == x){
                ans = true;
                break;
            }
        }
        return ans;
    }
}