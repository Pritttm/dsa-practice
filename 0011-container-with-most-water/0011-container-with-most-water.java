class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;
        int maxans=0;

        while(l<r){
            ans=(r-l)*(Math.min(height[l],height[r]));
            maxans=Math.max(ans,maxans);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return maxans;
    }
}