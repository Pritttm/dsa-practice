class Solution {
    public void sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        int twos=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeros++;
            else if(nums[i]==1) ones++;
            else twos++;
        }
        int k=0;
        while(zeros>0){
            nums[k]=0;
            k++;
            zeros--;
        }
        while(ones>0){
            nums[k]=1;
            k++;
            ones--;
        }
        while(twos>0){
            nums[k]=2;
            k++;
            twos--;
        }
    }
}