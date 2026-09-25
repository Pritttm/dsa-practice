class Solution {
    public int removeDuplicates(int[] nums) {
        int s=2;
        for(int i=2;i<nums.length;i++){
            int count=0;
            
            if(nums[s-2]!=nums[i]){
                nums[s]=nums[i];
                s++;
            }
        }
        return s;
    }
}