class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // k is window size

        int n = nums.length;
        int i = 0;
        if(k == 0) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(i<n&&i<=k){
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i],i);
            i++;
        }
        
        int j = 0;
        i =0;
        j = k;
        if(n == k) return false;
        while(i<n&&j+1<n){
            map.remove(nums[i]);
            if(map.containsKey(nums[j+1]))return true;
            map.put(nums[j+1],j+1);
            j++;
            i++;

        }
        return false;
    }
}