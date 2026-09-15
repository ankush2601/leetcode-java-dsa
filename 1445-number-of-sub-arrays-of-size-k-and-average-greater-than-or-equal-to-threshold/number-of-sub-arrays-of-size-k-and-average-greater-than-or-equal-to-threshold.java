class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int c = 0;
        if((sum/k) >= th){
            c = 1;
        }
        for(int i = k; i < arr.length; i++){
            sum -= arr[i-k];
            sum += arr[i];

            //check sum is >= threshold(th)
            if((sum/k) >= th){
                c++;
            }
        }
        return c;
    }
}