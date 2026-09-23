class Solution {
    public int maxVowels(String s, int k) {
        int vowelcount=0;

        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))) vowelcount++;
        }
        int maxvowel=vowelcount;

        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i))) vowelcount++;
            if(isvowel(s.charAt(i-k))) vowelcount--;

            maxvowel=Math.max(vowelcount,maxvowel);
        }
        return maxvowel;
    }

    private boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ;
    }
}