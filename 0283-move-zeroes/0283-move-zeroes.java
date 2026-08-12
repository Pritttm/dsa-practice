class Solution {
    public void moveZeroes(int[] nums) {
        int s=0;
        int f=0;
        while(f < nums.length){
            if(nums[f] != 0){
                nums[s]=nums[f];
                s++;
            }
            f++;
        }
        while(s< nums.length){
            nums[s]= 0;
            s++;
        }
    }
}