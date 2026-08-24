class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[strs.length-1];
        String l = strs[0], res="";
        
        String s = f.length() <= l.length()? f:l;
        for(int i = 0; i < s.length(); i++){
            if(f.charAt(i) != l.charAt(i)){
                return res;
            }
            res += f.charAt(i);
        }
        return res;
    }
}