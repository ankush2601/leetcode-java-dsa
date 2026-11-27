class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> flist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean flag[] = new boolean[nums.length];
        f(nums,flist,list,flag);
        return flist;
    }
    public static void f(int[] nums,List<List<Integer>> fl,List<Integer>l,boolean flag[] ){
      
       int  n = nums.length;
        //base case
        if(l.size() == n){
             fl.add(new ArrayList<>(l));
             return;
        }
        
        for(int i = 0; i < n; i++){
            if(flag[i]){
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1] && !flag[i-1] ){
                continue;
            }

            
             l.add(nums[i]);
             flag[i] = true;
        
            f(nums,fl,l,flag);
            l.remove(l.size()-1);   //backtracking
            flag[i] = false;        //backtracking

        }
    }
}