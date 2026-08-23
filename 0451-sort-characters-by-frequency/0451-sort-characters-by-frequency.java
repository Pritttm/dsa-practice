class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder ans= new StringBuilder();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        while(!map.isEmpty()) {
            char maxkey=0;
            int maxfreq=0;
            for(char key:map.keySet()){
                if(map.get(key) > maxfreq) {
                    maxfreq = map.get(key);
                    maxkey = key;
                }
            }
            for(int i = 0; i < maxfreq; i++) {
                ans.append(maxkey);
            }
            map.remove(maxkey);
        }
        return ans.toString();
    }
}