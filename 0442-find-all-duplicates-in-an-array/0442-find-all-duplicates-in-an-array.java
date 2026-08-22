class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums.length<1) return new ArrayList<>();

        ArrayList<Integer>ans=new ArrayList<>();

        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                ans.add(num);
            }
            set.add(num);
        }
        return ans;
    }
}