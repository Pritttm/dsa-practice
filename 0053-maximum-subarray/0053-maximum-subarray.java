class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int num:nums){
            sum=Math.max(num,sum+num);
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}