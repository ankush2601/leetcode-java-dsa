class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int res[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                res[k]=nums1[i];
                k++;
                i++;
            }
            else{
                res[k++]=nums2[j++];
            }
        }
        while(i<n1){
            res[k++]=nums1[i++];
        }
        while(j<n2){
            res[k++]=nums2[j++];
        }
        
        int  size=res.length;
        if(size%2==1){
            return (double)res[size/2];

        }
        //even case
        int half=size/2;
        double ans =(double) (res[half]+res[half-1]);
        return (double)ans/2;
    }
}