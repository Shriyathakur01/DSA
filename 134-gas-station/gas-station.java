class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalG=0;
        int totalC=0;
        for(int x:gas){
            totalG+=x;
        }
        for(int y:cost){
            totalC+=y;
        }
        if(totalG<totalC) return -1;
        
        int startIndex=0;
        int currentGas=0;
        for(int i=0;i<gas.length;i++){
            currentGas+=gas[i]-cost[i];
            if(currentGas<0){
                startIndex=i+1;
                currentGas=0;
            }
        }
        return startIndex;
    }
}