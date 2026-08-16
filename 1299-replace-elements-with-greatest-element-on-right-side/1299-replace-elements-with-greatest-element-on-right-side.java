class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int rmax=arr[i+1];
            for(int j=i+1;j<arr.length;j++){
                rmax=Math.max(rmax,arr[j]);
            }
            arr[i]=rmax;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}