class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];

        int leftpr=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=leftpr;
            leftpr*=nums[i];
        }
        int rightpr=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=rightpr;
            rightpr*=nums[i];
        }
        return ans;
    }
}