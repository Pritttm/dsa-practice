class Solution {
    public int[][] merge(int[][] vals) {
        
        Arrays.sort(vals,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]>ans=new ArrayList<>();

        int start=vals[0][0];
        int end=vals[0][1];

        for(int i=1;i<vals.length;i++){
            if(end>=vals[i][0]){
                end=Math.max(end,vals[i][1]);
            }else{
                ans.add(new int[]{start,end});
                start=vals[i][0];
                end=vals[i][1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
    }
}