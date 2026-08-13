class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer>set= new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
        int maxlength=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int start=num;
                int length=1;

                while(set.contains(start+1)){
                    start++;
                    length++;
                }
                maxlength= Math.max(maxlength,length);
            }
        }
        return maxlength;
    }
}