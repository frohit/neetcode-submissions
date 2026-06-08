class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i:nums){
            if(freqMap.containsKey(i))return true;
            freqMap.put(i,1);
        }return false;
    }
}