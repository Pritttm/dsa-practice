class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int min=0;
        for(int num:nums){
            min=Math.min(min,num);
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