class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        int maxfreq=0;
        int ans=0;

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int freq :map.values()){
            maxfreq= Math.max(freq,maxfreq);
        }

        for(int freq : map.values()){
            if(freq == maxfreq){
                ans += freq;
            }
        }
        return ans;
    }
}