class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0, r=0;
        int maxlen = 0, n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<n){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.get(ch)>2){
                while(map.get(ch)>2){
                    char ch1 = s.charAt(l);
                    map.put(ch1,map.getOrDefault(ch1,0)-1);
                    l++;
                }
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}