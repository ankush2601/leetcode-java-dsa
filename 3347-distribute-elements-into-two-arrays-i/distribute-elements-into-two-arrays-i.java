class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i = 2; i < nums.length; i++){
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1)){
                l1.add(nums[i]);
                continue;
            }
            l2.add(nums[i]);
        }
        
        int i = 0,j = 0;
        while(i < l1.size()){
            nums[i] = l1.get(i);
            i++;
        }
         while(j < l2.size()){
            nums[i+j] = l2.get(j);
            j++;
        }
        return nums;
    }
}