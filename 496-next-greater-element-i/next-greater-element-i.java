class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];  //set -1 to all index;
        for(int i = 0; i < res.length; i++){
            res[i] = -1;
        }
        for(int i = 0; i < nums1.length; i++){
            int ind = 0;
            for(int j = 0; j < nums2.length; j++){  //find index at which nums1[i] == nums2[j]
                if(nums1[i] == nums2[j]){
                    ind = j;
                    break;
                }
            }
            for(int k = ind+1; k < nums2.length; k++){
                if(nums1[i]  < nums2[k]){
                    res[i] = nums2[k];
                    break;
                }
            }
        }
        return res;
    }
}