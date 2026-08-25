class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0; i < n;  i++){
            int mul = (i+1)*k;
            boolean isPre=false;
            for(int j = 0; j < n;j++){
                if(nums[j] == mul){
                    isPre=true;
                }
            }
            if(isPre==false){
                return mul;
            }
        }
        return (n+1)*k;
    }
}