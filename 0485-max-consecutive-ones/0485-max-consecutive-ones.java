class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currcount=0;
        int maxcount=0;

        for(int num:nums){
            if(num==1) {
                currcount++;
                maxcount=Math.max(currcount,maxcount);
            }
            else currcount=0;
        }
        return maxcount;
    }
}