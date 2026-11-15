class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int key:map.keySet()){
            count=Math.max(count,map.get(key));
        }
        int ans=0;
        for(int key:map.keySet()){
            if(map.get(key)==count){
                ans+=map.get(key);
            }
        }
        return ans;
    }
}