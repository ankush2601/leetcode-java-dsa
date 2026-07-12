class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sort[] = arr.clone();
        Arrays.sort(sort);
        int ans = 1; 
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : sort){
            if(!map.containsKey(num)){
                map.put(num,ans++);
                continue;
            }
            
        }
        int res[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            res[i] = map.get(arr[i]);
        }
        return res;
    }
}