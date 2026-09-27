class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int ans[]=new int[nums.length]; 

        int leftproduct=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=leftproduct;
            leftproduct=leftproduct*nums[i];
        }

        int rightproduct=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]=ans[i]*rightproduct;
            rightproduct=rightproduct*nums[i];
        }
        return ans;
    }
}