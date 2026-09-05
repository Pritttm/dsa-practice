class Solution {
    public int maxProfit(int[] nums) {
        int buy=nums[0];
        int maxprofit=0;

        for(int i=1;i<nums.length;i++){
            if(buy>nums[i]) buy=nums[i];
            maxprofit=Math.max(nums[i]-buy,maxprofit);
        }
        return maxprofit;
    }
}