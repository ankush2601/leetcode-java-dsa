class Solution {
    public int characterReplacement(String s, int k) {
        int maxfre = 0,ans=0;
        int l = 0, r = 0, n = s.length();
        int[] fre = new int[26];
        while(r < n){
            int ind = s.charAt(r)-'A';
            fre[ind]++;
            maxfre = Math.max(maxfre,fre[ind]);
            int changes = (r-l+1)-maxfre;
            if(changes>k){
                fre[s.charAt(l)-'A']--;
                l++;
            }
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}