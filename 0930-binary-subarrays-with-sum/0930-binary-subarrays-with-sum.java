class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        int ans=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);

        for(int num:nums){
            sum+=num;
            int need=sum-goal;

            ans+=map.getOrDefault(need,0);

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}