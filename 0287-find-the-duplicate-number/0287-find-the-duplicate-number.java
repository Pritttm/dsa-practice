class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        int f=1;
        while(s<nums.length){
            if(nums[s]==nums[f]){
                return nums[s];
            }
            s++;
            f++;
        }
        return 0;
    }
}