class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int res = -1;
        for(int i = 0; i < nums.length; i++){
            ArrayList<Integer> list = f(nums,i);
            if(list.get(0)-list.get(1) <= k){
                return i;
            }
        }
        return -1;
    }
    public static ArrayList<Integer>  f(int[] nums, int ind){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= ind; i++){
            max = Math.max(max, nums[i]);
        }
        for(int i = ind; i < nums.length; i++){
            min = Math.min(min,nums[i]);
        }
        list.add(max);
        list.add(min);
        return list;
    }
}