class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        
        for(int num:nums){
            sum=Math.max(num,num+sum);
            maxsum=Math.max(sum,maxsum);
            
        }
        return maxsum;
    }
}