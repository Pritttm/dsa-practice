class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        HashSet<Integer>set=new HashSet<>();

        int reap=-1;
        int miss=-1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                    reap=grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        for(int i=1;i<=m*n;i++){
            if(!set.contains(i)){
                miss=i;
                break;
            }
        }
        return new int[]{reap,miss};
    }
}