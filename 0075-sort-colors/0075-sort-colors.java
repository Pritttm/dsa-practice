class Solution {
    private void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int m=0;

        while(m<=r){
            if(nums[m]==0){
                swap(nums,m,l);
                m++;
                l++;
            }
            else if(nums[m]==1) m++;
            else {
                swap(nums,m,r);
                r--;
            }
        }
    }
}