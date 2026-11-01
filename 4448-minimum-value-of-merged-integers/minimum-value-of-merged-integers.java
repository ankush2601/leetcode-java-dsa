class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i += 2) {
            int merged = nums[i];

            int temp = nums[i + 1];

            while (temp > 0) {
                merged *= 10;
                temp /= 10;
            }

            merged += nums[i + 1];

            min = Math.min(min, merged);
        }

        return min;
    }
}