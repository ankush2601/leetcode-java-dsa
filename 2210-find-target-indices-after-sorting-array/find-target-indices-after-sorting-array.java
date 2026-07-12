class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        //sort the arr
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]>nums[j]){
                    int t = nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                    
                }
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        return list;
    }
}