class Solution {
    public int longestConsecutive(int[] nums) {
        int min=Integer.MAX_VALUE;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            min=Math.min(num,min);
            set.add(num);
        }
        int ans=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num;
                int count=1;
                while(set.contains(curr+1)){
                    curr+=1;
                    count++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}