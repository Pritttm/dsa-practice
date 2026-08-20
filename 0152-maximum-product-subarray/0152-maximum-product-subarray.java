class Solution {
    public int maxProduct(int[] nums) {

        int maxprod=nums[0];
        int maxcurr=nums[0];
        int mincurr=nums[0];

        for(int i=1;i<nums.length;i++){
            int prevmax=maxcurr;
            int prevmin=mincurr;

            maxcurr=Math.max(nums[i],Math.max(nums[i]*prevmax,nums[i]*prevmin));
            mincurr=Math.min(nums[i],Math.min(nums[i]*prevmax,nums[i]*prevmin));

            maxprod=Math.max(maxprod,maxcurr);
        }
    
        return maxprod;
    }
}