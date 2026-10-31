class Solution {
    public int singleNumber(int[] nums) {
        int res = 0, n = nums.length;
        for(int i = 0; i < 32; i++){
            int c = 0;
            for(int j = 0; j < n; j++){
                if((nums[j] & (1 << i)) != 0){      // (ele & (1 << index): count 1's of each number on each bit
                    c++;
                } 
            }
            // all element appearing thrice except a single element : so modulo by 3
            if(c % 3 != 0) {
                res = res | (1<<i);
            }
        }
        return res;
    }
}