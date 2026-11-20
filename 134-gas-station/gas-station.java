class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int req = 0, n = gas.length;
    for(int i = 0; i < n; i++){
        req += gas[i];
        req -= cost[i];
    }       
    if(req < 0){
        return -1;
    }

    int s_pos = 0;  //starting position
    int gas_req = 0;
    int curr_gas = 0;

    for(int i = 0; i < n; i++){
      
        curr_gas = curr_gas + gas[i] - cost[i];

        if(curr_gas < 0){
            s_pos = i + 1;  
            curr_gas = 0;   //gas is not as much as it should be

        }
    }
    return  s_pos;
    }
}