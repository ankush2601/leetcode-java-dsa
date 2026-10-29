class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> flist = new ArrayList<>();

        int n = nums.length;    //num of bits
        for(int num = 0; num < Math.pow(2,n); num++){               //total number of subsets = 2^n        
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if((num & (1 << i)) != 0){
                    list.add(nums[i]);
                }
            }
            flist.add(list);                                       //add subarray into flist (list of list)
        }
        return flist;
    }
}