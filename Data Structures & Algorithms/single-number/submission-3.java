class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0 ) return -1;
        int l = nums[0];
        for(int i = 1;i<nums.length;i++){
            l = l^nums[i];
        }
        // if(l == 0) return -1;
        return l;
    }
}
