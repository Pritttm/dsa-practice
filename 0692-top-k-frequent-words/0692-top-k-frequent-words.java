class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,Integer>map=new HashMap<>();
        for(String st:words){
            map.put(st,map.getOrDefault(st,0)+1);
        }

        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
            int freqa=map.get(a);
            int freqb=map.get(b);
            if(freqa==freqb) return b.compareTo(a);
            return(freqa-freqb);
        });
        for(String key:map.keySet()){
            pq.offer(key);

            if(pq.size()>k){
                pq.poll();
            }
        }
        
        ArrayList<String>res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return res;
    }
}