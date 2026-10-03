class Solution {
    public int minAddToMakeValid(String s) {
        
        int openneed=0;
        int closeneed=0;

        for(char ch:s.toCharArray()){
            if(ch=='(') closeneed++;
            else{
                if(closeneed>0) closeneed--;
                else openneed++;
            }
        }
        return openneed+closeneed;
    }
}