class Solution {
    public void moveZeroes(int[] nums) {
        int s=0;
        for(int f=0;f<nums.length;f++){
            if(nums[f]!=0){
                nums[s]=nums[f];
                s++;
            }
        }
        while(s<nums.length){
            nums[s]=0;
            s++;
        }
    }
}