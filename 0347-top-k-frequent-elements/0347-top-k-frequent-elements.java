class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int ans[]=new int[k]; 
        for(int i=0;i<k;i++){
            int maxkey=0;
            int maxfreq=0;

            for(int key:map.keySet()){
                if(map.get(key)>maxfreq){
                    maxfreq=map.get(key);
                    maxkey=key;
                }
            }
            ans[i]=maxkey;
            map.remove(maxkey);
        }
        return ans;
    }
}