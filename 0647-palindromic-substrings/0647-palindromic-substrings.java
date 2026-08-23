class Solution {
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            palin(s,i,i);
            palin(s,i,i+1);
        }
        return count;
    }
    int count=0;
    private void palin(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
    }
}