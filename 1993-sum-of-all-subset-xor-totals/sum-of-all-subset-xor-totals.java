
class Solution {
    public int subsetXORSum(int[] nums) {

        int n = nums.length;
        ArrayList<ArrayList<Integer>> flist = new ArrayList<>();

        for(int num = 0; num < (1 << n); num++) {

            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0; i < n; i++) {

                if((num & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }

            if(list.size() != 0) {
                flist.add(list);
            }
        }

        int res = 0;

        for(int i = 0; i < flist.size(); i++) {

            int ans = 0;

            for(int j = 0; j < flist.get(i).size(); j++) {
                ans = ans ^ flist.get(i).get(j);
            }

            res += ans;
        }

        return res;
    }
}
