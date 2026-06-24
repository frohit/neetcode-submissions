class Solution {
    public int searchInsert(int[] nums, int target) {
        //upperbound

        int lower = 0;
        int upper = nums.length - 1;
        int resultIdx = nums.length;
        while(lower<=upper){
            int mid = (lower + upper)/2;
            if(target == nums[mid]) return mid;
            else if(target < nums[mid]){
                resultIdx = mid;//potential Idx
                upper = mid - 1;
            }else{
                lower = mid + 1;
            }
        }
        return resultIdx;
    }
}