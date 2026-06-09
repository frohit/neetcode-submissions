class Solution {
    public int removeElement(int[] nums, int val) {
     int hold = 0;
     int trav = 0;
     while(trav<nums.length){
        if(nums[trav]==val){
            trav++;
        }else{
            nums[hold] = nums[trav];
            hold++;
            trav++;
        }
     }
     return hold;   
    }
}