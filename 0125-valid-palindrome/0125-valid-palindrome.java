class Solution {
    public boolean isPalindrome(String s) {

        if(s.length()==0) return false;

        int l=0;
        int r=s.length()-1;

        while(l<r){
            char sle=s.charAt(l);
            char sri=s.charAt(r);

            if(!Character.isLetterOrDigit(sle)) l++;
            else if(!Character.isLetterOrDigit(sri)) r--;
            else{
                if(Character.toLowerCase(sle)!=Character.toLowerCase(sri)){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}