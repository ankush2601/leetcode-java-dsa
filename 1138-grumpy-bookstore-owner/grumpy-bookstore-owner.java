class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int l = 0, r = 0, n = customers.length;
        int base = 0, extra = 0;
        int max = 0,ans =0;
        while(r < n){
            if(grumpy[r] == 0){
                base += customers[r];
            }            
            if(grumpy[r] == 1){
                extra += customers[r];
            }
            while((r-l+1) > minutes){
                if(grumpy[l] == 1){
                    extra -= customers[l];
                }
                l++;
            }
            max = Math.max(max,extra);
            
            r++;
        }
        return max+base;
    }
}