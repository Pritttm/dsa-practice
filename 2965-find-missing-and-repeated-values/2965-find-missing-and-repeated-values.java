class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int repeate=-1;
        int missing=-1;

        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                    repeate=grid[i][j];
                }
                else set.add(grid[i][j]);
            }
        }
        for(int i=1;i<=m*n;i++){
            if(!set.contains(i)) {
                missing=i;
                break;
            }
        }
        return new int[]{repeate,missing};
    }
}