class Solution {
    public boolean wordPattern(String p, String s) {
        String[] arr = s.trim().split(" ");
        if(p.length() != arr.length){
            return false;
        }  

        HashMap<Character,String> m1 = new HashMap<>();
        HashMap<String,Character> m2 = new HashMap<>();

        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            String str = arr[i];
            if(m1.containsKey(ch)){
                if(!m1.get(ch).equals(str)){
                    return false;
                }
            }
            if(m2.containsKey(str)){
                if(m2.get(str) != ch){
                    return false;
                }
            }
            m1.put(ch,str);
            m2.put(str,ch);
        } 
        return true;
    }
}