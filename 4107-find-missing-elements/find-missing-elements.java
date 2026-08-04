class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int min = nums[0];
        int max = nums[nums.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = min; i <= max ; i++){
            if(set.contains(i)){
                continue;
            }
            list.add(i);
        }
        return list;
    }
}