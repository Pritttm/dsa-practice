class Solution {
    public int maxProduct(int[] nums) {
        int maxxprod=Integer.MIN_VALUE;
        int currmin=1;
        int currmax=1;

        for(int num:nums){
            int prevmin=currmin;
            int prevmax=currmax;

            currmin=Math.min(num,Math.min(prevmin*num,prevmax*num));
            currmax=Math.max(num,Math.max(prevmin*num,prevmax*num));

            maxxprod=Math.max(maxxprod,currmax);
        }
        return maxxprod;
    }
}