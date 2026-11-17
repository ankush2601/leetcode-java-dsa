class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();

        int ind = 0;
        for(int i = 1; i <= n && ind < target.length; i++){
    
            list.add("Push");
          
            if(i == target[ind]){
                ind++;
                continue;
            }
            else{
                list.add("Pop");
            }

        }
        return list;
    }
}