class Solution {
    public int majorityElement(int[] nums) {
        //Freq//voting
        int n = nums.length;
        if(n == 0) return -1;
        if(n==1) return nums[0];
        int can = nums[0];
        int count = 1;
        for(int i =1;i<n;i++){
            if(count == 0) can = nums[i];
            if(nums[i] == can) count++;
            else {
                count--;
            }
        }
        return  can;
    }
}