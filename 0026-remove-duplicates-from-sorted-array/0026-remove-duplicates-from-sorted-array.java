class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int l=0;
        for(int r=1;r<nums.length;r++){
            if(nums[l]!=nums[r]) l++;
            nums[l]=nums[r];
        }
        return l+1;
    }
}