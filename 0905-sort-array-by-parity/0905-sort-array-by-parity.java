class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                ans.add(nums[i]);
            }
        }
        int res[]=new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }

        return res;
    }
}