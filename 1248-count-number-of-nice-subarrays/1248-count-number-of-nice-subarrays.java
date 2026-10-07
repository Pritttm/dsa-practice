class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);

        int oddcount=0;
        int ans=0;

        for(int num:nums){
            if(num%2!=0) oddcount++;
            int need=oddcount-k;

            ans+=map.getOrDefault(need,0);

            map.put(oddcount,map.getOrDefault(oddcount,0)+1);
        }
        return ans;
    }
}