class Solution {
    public int generateKey(int num1, int num2, int num3) {
        ArrayList<String> list = new ArrayList<>();
        list.add(String.valueOf(num1));
        list.add(String.valueOf(num2));
        list.add(String.valueOf(num3));

        //make all string of same 4 length
        //ArrayList<StringBuilder> li = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            StringBuilder sb = new StringBuilder(String.valueOf(list.get(i)));
                while(sb.length() < 4){
                sb.insert(0,"0");
            }
            list.set(i,sb.toString());
        }
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i < 4; i++){
            int digit = Math.min(
                list.get(0).charAt(i) - '0',
                Math.min(
                    list.get(1).charAt(i) - '0',
                    list.get(2).charAt(i) - '0'
                )
            );
            sb1.append(digit);
        }
        return Integer.parseInt(sb1.toString());
    }
}