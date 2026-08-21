class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int evensum=0;
        for(int x:nums){
            if(x%2==0) evensum+=x;
        }

        int ans[]=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int val=queries[i][0];
            int pos=queries[i][1];

            if(nums[pos]%2==0){
                evensum-=nums[pos];
            }

            nums[pos]+=val;

            if(nums[pos]%2==0){
                evensum+=nums[pos];
            }
            ans[i]=evensum;
        }
        return ans;
    }
}