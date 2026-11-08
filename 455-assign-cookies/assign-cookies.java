class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);  //greed
        Arrays.sort(s);  //cookies
        int l = 0, r = 0;
        int n = g.length, m = s.length;
        while(l < m && r < n){
            if(g[r] <= s[l] ){
                r++;   //if satisfy g[l] with s[r] inc=>l
            }
            l++;
        }
        return r;
    }
}