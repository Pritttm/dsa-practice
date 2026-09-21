class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int a=1;
        int i=1;
        while(i<nums.length){
            if(nums[i-1]!=nums[i]){
                nums[a]=nums[i];
                a++;
            }
            i++;
        }
        return a;
    }
}