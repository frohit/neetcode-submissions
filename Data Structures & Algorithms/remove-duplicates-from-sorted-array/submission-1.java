class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return 1;
        int i = 1;
        int j = 1;

        while(i<nums.length){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
                i++;
            }else{
                i++;
            }
        }
        return j;
    }
}