class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int currmax=nums[0];
        int currmin=nums[0];

        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            int prevmax=currmax;
            currmax=Math.max(num,Math.max(currmax*num,currmin*num));
            currmin=Math.min(num,Math.min(prevmax*num,currmin*num));
            maxprod=Math.max(maxprod,Math.max(currmax,currmin));
        }
        return maxprod;
    }
}