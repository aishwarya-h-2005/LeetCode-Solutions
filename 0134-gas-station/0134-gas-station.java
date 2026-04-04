class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gas_total=0;
        int cost_total=0;
        for(int i=0;i<gas.length;i++)
        {
        gas_total+=gas[i];
        cost_total+=cost[i];
        }
        if(gas_total<cost_total)
        {
            return -1;
        }
       int current_gas=0;
       int starting_index=0;
       for(int i=0;i<gas.length;i++)
       {
       current_gas+=gas[i]-cost[i];
       if(current_gas<0)
       {
        starting_index=i+1;
        current_gas=0;
       }
       }
       return starting_index;    
    }
}