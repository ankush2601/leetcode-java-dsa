class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        if(n%2 != 0) return false;
        int p = n / 2;
        boolean visit[] = new boolean[n];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(visit[i] == true){
                    break;
                }
                if((nums[i] == nums[j]) && visit[j] != true ){
                    visit[j] = true;
                    visit[i] = true;
                    p--;
                    
                }
            }
        }
        return p==0? true:false;
    }
    
}