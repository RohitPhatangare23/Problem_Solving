package LeetCode_150;

public class _12_Gas_Station {
    public static void main(String[] args) {
        int[] gas={2,3,4};
        int[] cost={3,4,3};
        System.out.println(CanCompleteCircuit(gas,cost));
    }
    public static int CanCompleteCircuit(int[] gas, int[] cost){
        int n = gas.length;
        int total_surplus = 0;
        int surplus = 0;
        int start = 0;

        for(int i = 0; i < n; i++){
            total_surplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if(surplus < 0){
                surplus = 0;
                start = i + 1;
            }
        }
        return (total_surplus < 0) ? -1 : start;


    }
}
