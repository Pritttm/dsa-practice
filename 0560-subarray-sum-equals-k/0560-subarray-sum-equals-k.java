class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);

        int ans=0;
        int sum=0;

        for(int num:nums){
            sum+=num;

            int need=sum-k;

            ans+=map.getOrDefault(need,0);

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}