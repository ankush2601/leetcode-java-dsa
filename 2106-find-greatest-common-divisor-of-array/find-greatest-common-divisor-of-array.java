class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            min=Math.min(x,min);
            max=Math.max(x,max);
        }
        int ans = 1;
        for(int i = 2; i <= min; i++){
            if(min % i == 0 && max % i == 0){
                ans = i;
            }
        }    
    return ans;
    }
}